import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Working with GzipParametersWrapper
        GzipParametersWrapper gzipWrapper = new GzipParametersWrapper();
        Date modificationTime = new Date();
        gzipWrapper.setModificationTime(modificationTime);

        // Working with Student and Course
        Student student = new Student("Alice");
        Course math = new Course("Mathematics", 3);
        Course science = new Course("Science", 4);
        
        student.enrollInCourse(math);
        student.enrollInCourse(science);

        for (Course course : student.getCourses()) {
            System.out.println("Enrolled in: " + course.getCourseName() + " for " + course.getCredits() + " credits.");
        }

        // Read the modification time
        /* read */ Date retrievedTime = gzipWrapper.getModificationTime();
        System.out.println("Modification Time: " + retrievedTime);
    }
}