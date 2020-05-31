package complexDataStructures;

import java.sql.Driver;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {

    public static String[] vehicles = {

            "Ambulence", "Helicopter", "Lifeboat" };

    public static String[][] drivers = {

            { "Kabeer", "Shafi" }, { "Raju", "Somu", "Sukunan", "Prasad" }, { "Mary ", "Sam", "Bob" } };

    public static void main(String[] args) {

        Map<String, Set<String>> person = new HashMap<>();

        for (int i = 0; i < vehicles.length; i++) {

            String VehiclesList = vehicles[i];
            String[] driverList = drivers[i];

            Set<String> driverSet = new LinkedHashSet<>();

            for (String driver : driverList) {

                driverSet.add(driver);
            }

            person.put(VehiclesList, driverSet);
        }
        { // Brackets to just Scope emergencyDriver variable
          // Example Usage

            Set<String> emergencyDriver = person.get("Helicopter");
            for (String driver : emergencyDriver) {

                System.out.println(driver);

            }
        }
        // Iterate through whole thing

        for (String vehicle : person.keySet()) {
            System.out.print(vehicle);
            System.out.print(": ");
            Set<String> emergencyDriver = person.get(vehicle);
            for (String driver : emergencyDriver) {

                System.out.print(driver);
                System.out.print(" ");  

            }
            System.out.println();
        }
    }
}
