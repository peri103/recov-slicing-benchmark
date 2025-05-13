import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Use the ExpiringMap
        ExpiringMap expiringMap = new ExpiringMap(5, TimeUnit.SECONDS);
        expiringMap.putValue("key", "value");

        // Use the Course class
        Course course = new Course("Mathematics");
        course.addStudentScore("Alice", 95);
        course.addStudentScore("Bob", 88);
        
        // Print all student scores
        course.printAllScores();

        // Perform some operations
        int aliceScore = course.getStudentScore("Alice");
        int bobScore = course.getStudentScore("Bob");
        System.out.println("Alice's score: " + aliceScore);
        System.out.println("Bob's score: " + bobScore);

        // Sleep for a short duration to ensure the read happens before expiration
        try {
            Thread.sleep(1000); // 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Read the value from the ExpiringMap
        /* read */ String value = expiringMap.getValue("key");
        System.out.println("ExpiringMap value: " + value);
    }
}