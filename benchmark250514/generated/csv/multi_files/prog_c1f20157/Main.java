import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        StudentRecords studentRecords = new StudentRecords();
        Student alice = new Student("Alice", 30, "New York");
        Student bob = new Student("Bob", 25, "Los Angeles");

        studentRecords.addStudentRecord(alice);
        studentRecords.addStudentRecord(bob);

        String csvContent = studentRecords.getCsvContent();
        try {
            CSVRecord record = CSVFormat.DEFAULT.withHeader("Name", "Age", "City").parse(new StringReader(csvContent)).getRecords().get(0);

            // Additional unrelated operations
            int totalAge = alice.getAge() + bob.getAge();
            System.out.println("Total Age: " + totalAge);

            /* read */ boolean isSet = record.isSet("Name");
            System.out.println("Is 'Name' set? " + isSet); // Should print true as "Name" header was set and used
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}