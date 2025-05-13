import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String csvData = "name, age, city\nJohn, 30, New York";
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreSurroundingSpaces();

        ArrayList<String> cities = new ArrayList<>();
        HashMap<String, Integer> ageMap = new HashMap<>();

        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                String city = record.get("city");

                cities.add(city);
                ageMap.put(name, age);

                // Unrelated computation
                int sumOfAges = 0;
                for (int value : ageMap.values()) {
                    sumOfAges += value;
                }
                System.out.println("Sum of ages: " + sumOfAges);

                // More unrelated code
                for (String cityName : cities) {
                    System.out.println("City: " + cityName);
                }
            }

            // Separate unrelated computation
            int totalCities = cities.size();
            System.out.println("Total cities: " + totalCities);

            for (CSVRecord record : parser) {
                /* read */ boolean isConsistent = record.isConsistent();
                System.out.println("Is record consistent? " + isConsistent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}