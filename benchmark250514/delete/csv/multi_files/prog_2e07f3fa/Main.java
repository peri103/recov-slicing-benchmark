import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            StudentRegistry registry = new StudentRegistry();
            registry.addStudent(new Student("John", "Doe", 30));
            registry.addStudent(new Student("Alice", "Smith", 25));
            registry.addStudent(new Student("Bob", "Johnson", 40));

            CSVReader csvReader = new CSVReader(registry.getCSVData());
            CSVRecord csvRecord = csvReader.getRecord(0);

            // Read a specific value from the CSVRecord
            /* read */ String firstName = csvRecord.get(0);
            System.out.println("First Name: " + firstName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}