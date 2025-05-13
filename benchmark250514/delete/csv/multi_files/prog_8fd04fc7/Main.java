import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CSVUtils csvUtils = new CSVUtils();
        csvUtils.initializeFormat();

        String csvData = "name, age\nJohn Doe, 30\nJane Smith, 25";

        try {
            csvUtils.parseCSV(csvData);

            Map<String, Integer> nameToAgeMap = csvUtils.getNameToAgeMap();
            int sumOfAges = 0;
            for (Integer age : nameToAgeMap.values()) {
                sumOfAges += age;
            }
            System.out.println("Sum of ages: " + sumOfAges);

            CSVRecord firstRecord = csvUtils.getFirstRecord(csvData);
            /* read */ boolean isMapped = firstRecord.isMapped("name");
            System.out.println("Is 'name' mapped in the first record? " + isMapped);

            System.out.println("Name to Age Map: " + nameToAgeMap);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}