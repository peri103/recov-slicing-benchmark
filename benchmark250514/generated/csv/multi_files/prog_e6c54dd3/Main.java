import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvData = "Name,Age,Location\nAlice,30,New York\nBob,25,Los Angeles";
        CSVHandler csvHandler = new CSVHandler(csvData);
        
        List<CSVRecord> records = csvHandler.getRecords();
        StudentProcessor studentProcessor = new StudentProcessor(records);

        for (Student student : studentProcessor.getStudents()) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Location: " + student.getLocation());
        }

        // Checking if the 'Name' field is mapped in the first record
        boolean isMapped = studentProcessor.isNameMapped(records.get(0));
        System.out.println("Is 'Name' field mapped? " + isMapped);
    }
}