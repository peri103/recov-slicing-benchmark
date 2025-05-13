import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create a student and configure CSV
        Student student = new Student("Alice", 20);
        student.configureCSV();

        // Mock CSVRecord for demonstration
        CSVRecord record = new CSVRecord(null, null, null, student.getCSVConfig().getFormat());

        // Check if the column is mapped
        CSVRecordChecker checker = new CSVRecordChecker(record);
        boolean isMapped = checker.isColumnMapped("column");

        // Output the result
        System.out.println("Is 'column' mapped: " + isMapped);

        // Additional logic: Display student details
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}