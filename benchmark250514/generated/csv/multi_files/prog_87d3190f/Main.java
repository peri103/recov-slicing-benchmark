import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // CSVHandler operations
        CSVHandler csvHandler = new CSVHandler();
        csvHandler.addHeaderComment("This is a comment");
        String csvContent = "# This is a comment\nheader1,header2\nvalue1,value2";
        csvHandler.initializeParser(csvContent);
        String comment = csvHandler.getFirstComment();
        System.out.println("CSV Comment: " + comment);

        // Student and Course operations
        Student student = new Student("John Doe");
        Course math = new Course("Mathematics", 4);
        Course science = new Course("Science", 3);

        student.enrollCourse(math);
        student.enrollCourse(science);

        System.out.println("Student: " + student.getName());
        ArrayList<Course> courses = student.getCourses();
        for (Course course : courses) {
            System.out.println("Enrolled in: " + course.getCourseName() + " with " + course.getCredits() + " credits.");
        }
    }
}