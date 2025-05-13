import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "Name,Age,Location\nJohn,30,USA\nJane,25,UK";
        CSVFormat format = CSVFormat.DEFAULT;

        // Prepare the CSVFormat with the first record as header
        /* write */ CSVFormat csvFormatWithHeader = format.withFirstRecordAsHeader();

        try {
            StringReader reader = new StringReader(csvData);
            Iterable<CSVRecord> records = csvFormatWithHeader.parse(reader);
            Iterator<CSVRecord> iterator = records.iterator();

            // Additional logic to process CSV records
            while (iterator.hasNext()) {
                CSVRecord record = iterator.next();
                String name = record.get("Name");
                String age = record.get("Age");
                String location = record.get("Location");

                // Print out the details of each record
                System.out.println("Name: " + name + ", Age: " + age + ", Location: " + location);

                // Perform some calculations based on age
                int ageInt = Integer.parseInt(age);
                int ageInMonths = ageInt * 12;
                System.out.println("Age in months: " + ageInMonths);
            }

            // Check if a particular header is mapped
            if (records.iterator().hasNext()) {
                CSVRecord firstRecord = records.iterator().next();
                /* read */ boolean isMapped = firstRecord.isMapped("Name");
                System.out.println("Is 'Name' mapped: " + isMapped);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Additional unrelated code to make the program more complex
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}