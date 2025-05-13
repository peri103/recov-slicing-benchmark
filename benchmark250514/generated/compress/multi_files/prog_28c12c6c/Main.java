import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GzipConfig gzipConfig = new GzipConfig();
        gzipConfig.setOperatingSystem(3);

        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        course.enrollStudent(student1.getId());
        course.enrollStudent(student2.getId());

        System.out.println("Course: " + course.getCourseName());
        System.out.println("Enrolled Students IDs: " + course.getStudentIds());

        // Complex logic involving students and courses
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        for (Student student : students) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }

        // Reading the operating system value set earlier
        /* read */ int operatingSystem = gzipConfig.getOperatingSystem();
        System.out.println("Operating System Code: " + operatingSystem);
    }
}