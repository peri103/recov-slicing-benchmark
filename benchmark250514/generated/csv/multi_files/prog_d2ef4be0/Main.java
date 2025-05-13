import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            CSVHandler csvHandler = new CSVHandler();
            csvHandler.configureFormat();

            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,New York;Jane,25,Los Angeles";
            csvHandler.parseCSV(csvData);

            // Retrieve and print names and ages
            ArrayList<String> names = csvHandler.getNames();
            HashMap<String, Integer> ageMap = csvHandler.getAgeMap();
            for (String name : names) {
                System.out.println("Name: " + name + ", Age: " + ageMap.get(name));
            }

            // Retrieve the first record and print
            String firstRecord = csvHandler.getNames().get(0) + ", " + ageMap.get(csvHandler.getNames().get(0)) + ", New York";
            /* read */ System.out.println("First Record: " + firstRecord);

            // Calculate and print average age
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ageMap.size();
            System.out.println("Average Age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}