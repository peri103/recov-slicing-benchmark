import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a JarArchiveDetails object and set compressed size
        JarArchiveDetails jarDetails = new JarArchiveDetails("example.jar");
        jarDetails.setCompressedSize(2048);

        // Create a Course and add Students
        Course course = new Course("Computer Science");
        course.enrollStudent(new Student("Alice", 1001));
        course.enrollStudent(new Student("Bob", 1002));

        // Print details of the course
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getStudentId());
        }

        // Additional operations
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1001, "Alice");
        studentMap.put(1002, "Bob");

        for (int id : studentMap.keySet()) {
            System.out.println("ID: " + id + ", Name: " + studentMap.get(id));
        }

        // Read the compressed size from JarArchiveDetails
        /* read */ long compressedSize = jarDetails.getCompressedSize();
        System.out.println("Compressed Size: " + compressedSize);
    }
}