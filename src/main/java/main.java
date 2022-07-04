import dbConnection.DatabaseConnection;
import dbConnection.RawMeasurement;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        ArrayList<RawMeasurement> measurements = db.getMeasurementsLastMonth();
        for(RawMeasurement rm : measurements){
            System.out.println(rm.toString());
        }
    }
}
