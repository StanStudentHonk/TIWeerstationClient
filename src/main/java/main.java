import dbConnection.DatabaseConnection;
import dbConnection.RawMeasurement;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        LocalDateTime ldt = LocalDateTime.now();
        ldt = ldt.minusYears(4);
        System.out.println(ldt);
        ArrayList<RawMeasurement> rm = db.getMeasurementsSince(ldt);
        System.out.println(rm.size() + "");
    }
}
