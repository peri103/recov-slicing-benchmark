import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Initialize GzipParametersWrapper and set modification time
        GzipParametersWrapper gzipWrapper = new GzipParametersWrapper();
        Date currentTime = new Date();
        gzipWrapper.setModificationTime(currentTime);

        // Create a student and enroll in courses
        Student student = new Student("John Doe");
        Course math = new Course("Mathematics", 3);
        Course science = new Course("Science", 4);

        student.enroll(math);
        student.enroll(science);

        // Display student details
        System.out.println("Student Name: " + student.getName());
        for (Course course : student.getCourses()) {
            System.out.println("Enrolled in: " + course.getCourseName() + " (" + course.getCredits() + " credits)");
        }

        // Retrieve and print the modification time
        /* read */ Date modificationTime = gzipWrapper.getModificationTime();
        System.out.println("Gzip Modification Time: " + modificationTime);
    }
}