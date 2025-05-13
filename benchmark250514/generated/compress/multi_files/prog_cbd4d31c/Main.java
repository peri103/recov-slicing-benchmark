import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Managing JarEntry
        JarEntryManager jarManager = new JarEntryManager("example.jar");
        jarManager.setEntryTime(1633024800000L);

        // Creating student and courses
        Student student = new Student("John Doe");
        Course math = new Course("Mathematics", 3);
        Course science = new Course("Science", 4);

        student.enrollCourse(math);
        student.enrollCourse(science);

        List<Course> courses = student.getCourses();
        for (Course course : courses) {
            System.out.println(student.getName() + " enrolled in " + course.getCourseName() + " with " + course.getCredits() + " credits.");
        }

        // Reading the time from JarEntry
        /* read */ long time = jarManager.getEntryTime();
        System.out.println("Jar Entry Time: " + time);
    }
}