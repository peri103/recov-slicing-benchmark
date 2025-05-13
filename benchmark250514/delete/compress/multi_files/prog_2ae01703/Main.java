import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Using GzipParametersWrapper
        GzipParametersWrapper gzipWrapper = new GzipParametersWrapper();
        gzipWrapper.setUncompressedSize(1024L);

        // Creating students and courses
        Student student1 = new Student("Alice");
        Course math = new Course("Mathematics", 3);
        Course science = new Course("Science", 4);
        student1.enrollCourse(math);
        student1.enrollCourse(science);

        Student student2 = new Student("Bob");
        Course history = new Course("History", 2);
        student2.enrollCourse(history);

        // Print student information
        printStudentInfo(student1);
        printStudentInfo(student2);

        // Using a Map for additional complexity
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("key1", 100);
        dataMap.put("key2", 200);
        dataMap.put("key3", 300);

        int sum = 0;
        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in dataMap: " + sum);

        // Original read operation
        /* read */ long uncompressedSize = gzipWrapper.getUncompressedSize();
        System.out.println("Original uncompressed size: " + uncompressedSize);
    }

    public static void printStudentInfo(Student student) {
        System.out.println("Student: " + student.getName());
        for (Course course : student.getCourses()) {
            System.out.println("  Course: " + course.getCourseName() + ", Credits: " + course.getCredits());
        }
    }
}