import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        try {
            CSVHandler csvHandler = new CSVHandler();
            csvHandler.setDelimiter(';'); // Set delimiter

            // Example CSV data
            String csvData = "name;age;city\nJohn;30;New York\nAlice;25;Los Angeles";

            // Parse CSV data
            csvHandler.parseCSV(csvData);

            // Retrieve a specific record
            CSVRecord johnRecord = csvHandler.getRecordByName("John");

            // Create Student object from CSVRecord
            Student john = new Student(johnRecord.get(0), Integer.parseInt(johnRecord.get(1)), johnRecord.get(2));

            // Additional logic
            System.out.println("Student Name: " + john.getName());
            System.out.println("Student Age: " + john.getAge());
            System.out.println("Student City: " + john.getCity());

            // Read the record as a string
            /* read */ String recordString = johnRecord.toString();
            System.out.println(recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}