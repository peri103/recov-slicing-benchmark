import java.util.HashMap;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a course with a name
        Course course = new Course("Mathematics");

        // Create a student enrolled in the course
        Student student = new Student("John Doe", course);

        // Output student information
        System.out.println("Student: " + student.getName());
        System.out.println("Course: " + student.getCourse().getCourseName());

        // Retrieve the instance of Integer from the course's instanceMap
        /* read */ Integer value = course.getInstanceMap().getInstance(Integer.class);
        System.out.println("Instance value from course: " + value);

        // Create a HashMap and populate it with some data
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");

        // Create an ImmutableMap from the HashMap
        ImmutableMap<String, String> immutableMap = ImmutableMap.copyOf(hashMap);

        // Perform some operations on the immutableMap
        if (immutableMap.containsKey("key1")) {
            System.out.println("Key1 exists with value: " + immutableMap.get("key1"));
        }

        // Perform additional operations on the HashMap
        hashMap.put("key3", "value3");
        hashMap.remove("key2");

        // Iterate over the hashMap and print its contents
        for (String key : hashMap.keySet()) {
            System.out.println("HashMap Key: " + key + ", Value: " + hashMap.get(key));
        }
    }
}