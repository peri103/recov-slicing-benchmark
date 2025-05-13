import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvData = "name,age,city\nJohn,23,New York\nJane,29,Los Angeles\n";

        CSVHandler csvHandler = new CSVHandler();
        List<CSVRecord> records = csvHandler.parseCSV(csvData);

        StudentDatabase studentDatabase = new StudentDatabase();
        studentDatabase.loadStudents(records);

        Student john = studentDatabase.getStudent("John");
        if (john != null) {
            System.out.println("John's age: " + john.getAge());
        }

        CSVRecordChecker recordChecker = new CSVRecordChecker();
        boolean isNameSet = recordChecker.isColumnSet(records.get(0), "name");
        System.out.println("Is 'name' set in the first record? " + isNameSet);

        Student jane = studentDatabase.getStudent("Jane");
        if (jane != null) {
            System.out.println("Jane's city: " + jane.getCity());
        }
    }
}