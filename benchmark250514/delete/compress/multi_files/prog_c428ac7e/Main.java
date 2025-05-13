import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipParametersWrapper gzipWrapper = new GzipParametersWrapper();
        gzipWrapper.setCompressedSize(12345L);

        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 20, course);
        Student student2 = new Student("Bob", 22, course);

        course.enrollStudent(student1);
        course.enrollStudent(student2);

        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Additional complexity: Using ArrayList
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(i * 5);
        }

        // Additional complexity: Using HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Accessing data from HashMap
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Simulate some calculations
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum of first 100 numbers: " + sum);

        // More processing
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);

        /* read */ long compressedSize = gzipWrapper.getCompressedSize();
        System.out.println("Compressed Size: " + compressedSize);
    }
}