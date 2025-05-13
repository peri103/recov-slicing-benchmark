import com.google.common.collect.ImmutableBiMap;

public class Main {
    public static void main(String[] args) {
        // Create a course and student
        Course course = new Course();
        Student student = new Student("John Doe", course);
        student.enroll("Mathematics");

        // Use BiMapHandler to manage key-value pairs
        BiMapHandler handler = new BiMapHandler();
        handler.putEntry("key", "value");
        ImmutableBiMap<String, String> biMap = handler.build();

        // Retrieve the value using the key
        /* read */ String value = biMap.get("key");
        System.out.println("Retrieved value: " + value);

        // Display student's course
        System.out.println("Student " + student.getCourseName() + " is enrolled in: " + course.getCourseName());
    }
}