import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarEntryManager tarEntryManager = new TarEntryManager("example.txt");
        
        // Set user name in TarEntryManager
        tarEntryManager.setUserName("JohnDoe");
        
        // Create a course and add students
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));
        
        // Print student details
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }
        
        // Additional unrelated complexity
        HashMap<String, Integer> userAccessMap = new HashMap<>();
        userAccessMap.put("Alice", 1);
        userAccessMap.put("Bob", 2);
        
        for (String key : userAccessMap.keySet()) {
            System.out.println("User: " + key + ", Access Level: " + userAccessMap.get(key));
        }
        
        // Retrieve user name from TarEntryManager
        /* read */ String userName = tarEntryManager.getUserName();
        System.out.println("Retrieved User Name from TarEntryManager: " + userName);
    }
}