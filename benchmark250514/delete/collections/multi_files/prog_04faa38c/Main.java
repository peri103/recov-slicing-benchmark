import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CustomMap customMap = new CustomMap();
        customMap.addValue("key", 42);

        Course course = new Course("Introduction to Programming");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Instructor: " + course.getCourseDetail("Instructor"));
        
        // Perform some unrelated logic
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
        
        // Access the unmodifiable map and read the value
        Map<String, Integer> unmodifiableMap = customMap.getUnmodifiableMap();
        /* read */ Integer value = unmodifiableMap.get("key").iterator().next();
        
        // Output the value
        System.out.println("Value from UnmodifiableMultiValuedMap: " + value);
    }
}