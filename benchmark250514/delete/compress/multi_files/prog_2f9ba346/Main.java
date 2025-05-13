import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize GzipConfig
        GzipConfig gzipConfig = new GzipConfig();

        // Set compressed size
        gzipConfig.setCompressedSize(2048L);

        // Create a Course and Students
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addGrade(85);
        student2.addGrade(90);

        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Print student grades
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Grades for " + student.getGrades());
        }

        // Perform some unrelated operations
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 85);
        map.put("Bob", 90);

        int total = 0;
        for (int value : map.values()) {
            total += value;
        }
        System.out.println("Total Grades: " + total);

        // Read compressed size
        /* read */ long compressedSize = gzipConfig.getCompressedSize();
        System.out.println("Compressed Size: " + compressedSize);
    }
}