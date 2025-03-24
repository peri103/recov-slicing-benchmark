import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create TableData instance
        TableData tableData = new TableData();
        
        // Add data to the table
        tableData.addData("row1", "column1", 42);
        
        // Create a course and students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Add scores to students
        student1.addScore(90);
        student2.addScore(85);
        
        // Add students to the course
        course.addStudent(student1);
        course.addStudent(student2);

        // /* read */ Retrieve data from the table
        int value = tableData.getData("row1", "column1");
        
        // Print the retrieved value
        System.out.println("Table value: " + value);
        
        // Print student names and scores
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Score: " + student.getScores().get(0));
        }
    }
}