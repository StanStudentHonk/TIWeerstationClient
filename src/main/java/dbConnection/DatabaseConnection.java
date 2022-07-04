package dbConnection;

import com.google.protobuf.Timestamp;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.weather.ProtoTimeBlock;
import proto.weather.ProtoWeatherDataRequest;
import proto.weather.WeatherDataGrpc;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DatabaseConnection {
    public static final String host = "localhost";
    public static final int port = 5000;
    private ManagedChannel channel;
    private WeatherDataGrpc.WeatherDataBlockingStub blockingStub;
    private WeatherDataGrpc.WeatherDataStub asyncStub;

    public DatabaseConnection() {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
    }

    /** Construct client for accessing RouteGuide server using the existing channel. */
    public DatabaseConnection(ManagedChannelBuilder<?> channelBuilder) {
        channel = channelBuilder.build();
        blockingStub = WeatherDataGrpc.newBlockingStub(channel);
        asyncStub = WeatherDataGrpc.newStub(channel);
    }

    public RawMeasurement getMostRecentMeasurement()
    {
        ProtoWeatherDataRequest request = ProtoWeatherDataRequest.newBuilder().setTimeAmount(1).setTimeunit("year").build();
        List<RawMeasurement> rawMeasurements = this.blockingStub.getLastDataPoint(request).getWeatherDataPointsList()
                .stream()
                .map(point -> {
                    return new RawMeasurement(point);
                }).collect(Collectors.toList());
        return rawMeasurements.get(0);
    }

    public ArrayList<RawMeasurement> getMeasurementsBetween(LocalDateTime begin, LocalDateTime end)
    {
        ProtoTimeBlock request = ProtoTimeBlock.newBuilder().setTimeStart(convertLocalDateTimeToGoogleTimestamp(begin)).setTimeEnd(convertLocalDateTimeToGoogleTimestamp(end)).build();
        ArrayList<RawMeasurement> rawMeasurements = (ArrayList<RawMeasurement>) this.blockingStub.getWeatherDataBetween(request).getWeatherDataPointsList()
                .stream()
                .map(point -> {
                    return new RawMeasurement(point);
                }).collect(Collectors.toList());
        return rawMeasurements;
    }
    public ArrayList<RawMeasurement> getMeasurementsSince(LocalDateTime since) {return getMeasurementsBetween(since, LocalDateTime.now());}

    public ArrayList<RawMeasurement> getMeasurementsLastYear() { return getMeasurementLastTimeUnit("year", 1);}

    public ArrayList<RawMeasurement> getMeasurementsLastMonth() { return getMeasurementsLastMonths(1);}
    public ArrayList<RawMeasurement> getMeasurementsLastMonths(int months) {return getMeasurementLastTimeUnit("month", months); }

    public ArrayList<RawMeasurement> getMeasurementsLastDay() { return getMeasurementsLastDays(1); }
    public ArrayList<RawMeasurement> getMeasurementsLastDays(int days) { return getMeasurementLastTimeUnit("day", days); }

    public ArrayList<RawMeasurement> getMeasurementsLastHour() { return getMeasurementsLastHours(1); }
    public ArrayList<RawMeasurement> getMeasurementsLastHours(int hours) { return getMeasurementLastTimeUnit("hour", hours); }

    private ArrayList<RawMeasurement> getMeasurementLastTimeUnit(String timeunit, int amount){
        ProtoWeatherDataRequest request = ProtoWeatherDataRequest.newBuilder().setTimeAmount(amount).setTimeunit(timeunit).build();
        ArrayList<RawMeasurement> rawMeasurements = (ArrayList<RawMeasurement>) this.blockingStub.getWeatherData(request).getWeatherDataPointsList()
                .stream()
                .map(point -> {
                    return new RawMeasurement(point);
                }).collect(Collectors.toList());
        return rawMeasurements;
    }

    private Timestamp convertLocalDateTimeToGoogleTimestamp(LocalDateTime localDateTime) {
        Instant instant = localDateTime.toInstant(ZoneOffset.UTC);
        Timestamp result = Timestamp.newBuilder()
                .setSeconds(instant.getEpochSecond())
                .setNanos(instant.getNano())
                .build();
        return result;
    }
}
