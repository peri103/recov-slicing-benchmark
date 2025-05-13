import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a TarEntryManager and set the user ID
        TarEntryManager tarEntryManager = new TarEntryManager("example.txt");
        tarEntryManager.setUserId(1001);

        // Create a student and courses
        Student student = new Student("John Doe");
        Course math = new Course("Mathematics", 3);
        Course physics = new Course("Physics", 4);

        // Enroll student in courses
        student.enrollCourse(math);
        student.enrollCourse(physics);

        // Print student details
        System.out.println("Student: " + student.getName());
        for (Course course : student.getCourses()) {
            System.out.println("Enrolled in: " + course.getCourseName() + " (" + course.getCredits() + " credits)");
        }

        // Retrieve the user ID from the TarEntryManager
        /* read */ int userId = tarEntryManager.getUserId();
        System.out.println("User ID from TarEntryManager: " + userId);

        // Create a HashMap to store some data
        HashMap<String, Integer> userMap = new HashMap<>();
        userMap.put("John Doe", userId);

        // Check if the user ID exists in the HashMap
        if (userMap.containsValue(userId)) {
            System.out.println("User ID " + userId + " found in userMap.");
        } else {
            System.out.println("User ID " + userId + " not found in userMap.");
        }
    }
}