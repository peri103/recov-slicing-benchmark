import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVHandler and CSVReader
            CSVHandler csvHandler = new CSVHandler();
            csvHandler.writeComment("This is a comment");
            
            // Create a student and enroll in courses
            Student student = new Student("Alice");
            Course math = new Course("Mathematics", 3);
            Course science = new Course("Science", 4);
            student.enrollInCourse(math);
            student.enrollInCourse(science);

            // Read the comment using CSVReader
            CSVReader csvReader = new CSVReader();
            String comment = csvReader.readComment(csvHandler.getCSVData());
            System.out.println("Comment from CSV: " + comment);

            // Display student information
            System.out.println("Student: " + student.getName());
            for (Course course : student.getCourses()) {
                System.out.println("Enrolled in: " + course.getCourseName() + " (" + course.getCredits() + " credits)");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}