import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a UserEntry and set the user name
        UserEntry userEntry = new UserEntry("example.txt");
        userEntry.setUserName("testUser");

        // Create a Course and enroll students
        Course course = new Course("Computer Science");
        course.enrollStudent("Alice");
        course.enrollStudent("Bob");

        // Print enrolled students
        System.out.println("Enrolled students in " + course.getEnrolledStudents());

        // Create a HashMap to store student ages
        HashMap<String, Integer> studentAges = new HashMap<>();
        studentAges.put("Alice", 20);
        studentAges.put("Bob", 22);

        // Print student ages
        for (String student : studentAges.keySet()) {
            System.out.println(student + "'s age: " + studentAges.get(student));
        }

        // Retrieve and print the user name from UserEntry
        /* read */ String userName = userEntry.getUserName();
        System.out.println("User name in entry: " + userName);
    }
}