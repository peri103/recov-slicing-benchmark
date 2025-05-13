import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create CSV configuration
        CSVConfiguration csvConfig = new CSVConfiguration();

        // Sample CSV data
        String csvData = "name,age\nJohn,30\nJane,25";

        // Process CSV data
        CSVDataProcessor dataProcessor = new CSVDataProcessor();
        dataProcessor.parseCSV(csvData, csvConfig.getFormat());

        // Check if a column is set
        boolean isColumnSet = dataProcessor.isColumnSet(0, 1);
        System.out.println("Is column set for first record: " + isColumnSet);

        // Create and process students
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 30));
        students.add(new Student("Jane", 25));

        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}