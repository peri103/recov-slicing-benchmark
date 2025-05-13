import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a LabelFormatter instance
        LabelFormatter labelFormatter = new LabelFormatter();

        // Set the format using the write method
        labelFormatter.setFormat("{0}: {1}, {2}");

        // Create a course and add students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addGrade(85);
        student1.addGrade(90);
        student2.addGrade(78);
        student2.addGrade(82);

        course.addStudent(student1);
        course.addStudent(student2);

        // Retrieve and print student information
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Grades: " + student.getGrades());
        }

        // Use the read method to get the format string
        /* read */ String formatString = labelFormatter.getFormat();

        // Print the format string to verify the read operation
        System.out.println("Format String: " + formatString);

        // Format and print output using the format string
        for (Student student : course.getStudents()) {
            for (int grade : student.getGrades()) {
                String formattedOutput = String.format(formatString, student.getName(), "Grade", grade);
                System.out.println("Formatted Output: " + formattedOutput);
            }
        }
    }
}