import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Manage JarArchiveEntry
        JarEntryManager manager = new JarEntryManager("initialName");
        manager.updateName("updatedName");

        // Work with Students and Courses
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        student1.enrollCourse(course1.getCourseName());
        student2.enrollCourse(course2.getCourseName());

        course1.addStudent(student1);
        course2.addStudent(student2);

        // Print student courses
        for (String course : student1.getCourses()) {
            System.out.println(student1.getName() + " is enrolled in " + course);
        }

        for (String course : student2.getCourses()) {
            System.out.println(student2.getName() + " is enrolled in " + course);
        }

        // Retrieve and print the updated name from JarArchiveEntry
        /* read */ String name = manager.retrieveName();
        System.out.println("Jar entry name: " + name);
    }
}