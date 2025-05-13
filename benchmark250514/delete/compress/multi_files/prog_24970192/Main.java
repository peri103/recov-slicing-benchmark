import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a GzipParametersWrapper and set a modification time
        GzipParametersWrapper gzipWrapper = new GzipParametersWrapper();
        Date modificationTime = new Date();
        gzipWrapper.setModificationTime(modificationTime);

        // Create a student and enroll in courses
        Student student = new Student("John Doe");
        student.enrollCourse(new Course("Math", 3));
        student.enrollCourse(new Course("Science", 4));

        // Print student details
        System.out.println("Student: " + student.getName());
        for (Course course : student.getCourses()) {
            System.out.println("Enrolled in: " + course.getCourseName() + " for " + course.getCredits() + " credits");
        }

        // Read the modification time from GzipParameters
        /* read */ Date readModificationTime = gzipWrapper.getModificationTime();
        System.out.println("Modification Time: " + readModificationTime);
    }
}