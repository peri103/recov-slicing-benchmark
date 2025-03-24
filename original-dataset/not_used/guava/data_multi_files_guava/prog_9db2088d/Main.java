import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CacheManager
        CacheManager cacheManager = new CacheManager();
        
        // Add value to the cache
        cacheManager.addValue(1, "Hello, World!");

        // Create a Student object
        Student student = new Student("Alice");
        student.addScore(95);
        student.addScore(88);

        // Retrieve scores
        List<Integer> scores = student.getScores();
        
        // Read from cache
        /* read */ String value = cacheManager.getValue(1);
        
        // Print the value retrieved from the cache and the first score
        System.out.println(value);
        System.out.println("Student: " + student.getName() + ", First Score: " + scores.get(0));
    }
}