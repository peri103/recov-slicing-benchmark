import org.apache.commons.collections4.multimap.TreeValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the TreeValuedHashMap
        TreeValuedHashMap<String, Integer> map = new TreeValuedHashMap<>();
        
        // Create a Course object
        Course course = new Course("Java Programming");

        // Add students to the course
        course.addStudent(new Student("Alice", 90));
        course.addStudent(new Student("Bob", 85));
        course.addStudent(new Student("Charlie", 88));

        // Display course information
        course.displayCourseInfo();

        // Write a value into the map
        /* write */ map.put("key1", 42);
        
        // Perform operations on the map
        System.out.println("Performing operations on the map...");

        // Read the value back from the map
        Integer value = map.get("key1").iterator().next();

        // Print the value to verify correctness
        System.out.println("Read value from TreeValuedHashMap: " + value);
    }
}
