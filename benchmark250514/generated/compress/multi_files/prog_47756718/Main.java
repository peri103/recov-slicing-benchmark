import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a TarEntryManager and set modification time
        TarEntryManager manager = new TarEntryManager("example.txt");
        Date modTime = new Date();
        manager.setModificationTime(modTime);

        // Create a Student and enroll in courses
        Student student = new Student("John Doe");
        Course math = new Course("Mathematics", 3);
        Course science = new Course("Science", 4);
        student.enrollInCourse(math);
        student.enrollInCourse(science);

        // Display student's courses
        for (Course course : student.getCourses()) {
            System.out.println("Course: " + course.getCourseName() + ", Credits: " + course.getCourseCredits());
        }

        // Read modification time
        /* read */ Date readModTime = manager.getModificationTime();
        System.out.println("Modification Time: " + readModTime);
    }
}