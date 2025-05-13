import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a Student instance and add grades
        Student student = new Student("Alice");
        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(78);
        
        // Print the student's grades
        student.printGrades();

        // Create CSV data with a comment
        String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

        // Handle CSV operations
        CSVHandler csvHandler = new CSVHandler(csvData);
        String comment = csvHandler.getComment();

        // Print the CSV comment
        System.out.println("CSV Comment: " + comment);
    }
}