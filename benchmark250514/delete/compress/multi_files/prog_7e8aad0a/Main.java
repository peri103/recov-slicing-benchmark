import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Utilize GzipUtils to set and retrieve extra data
        GzipUtils gzipUtils = new GzipUtils();
        byte[] extraData = {1, 2, 3, 4, 5};
        gzipUtils.setExtraData(extraData);

        // Create a new course and add students
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20, "S001"));
        course.addStudent(new Student("Bob", 22, "S002"));

        // Display course details
        System.out.println("Course Name: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge() + ", ID: " + student.getStudentId());
        }

        // Perform some unrelated operations
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);

        for (String str : stringList) {
            System.out.println("String List Item: " + str);
        }

        for (String key : map.keySet()) {
            System.out.println("Map Key: " + key + ", Value: " + map.get(key));
        }

        // Read the extra data from GzipUtils
        /* read */ byte[] readExtraData = gzipUtils.getExtraData();
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
    }
}