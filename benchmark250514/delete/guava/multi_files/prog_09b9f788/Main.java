import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob");

        // Add scores for the student
        student.addScore("Math", 95);
        student.addScore("Science", 85);

        // Print scores
        System.out.println("Math score: " + student.getScore("Math"));
        System.out.println("Science score: " + student.getScore("Science"));

        // Add range data
        Range<Integer> range = Range.closed(1, 10);
        student.addRangeData(range, "Hello, World!");

        // Perform some unrelated operations
        int totalScore = student.getScore("Math") + student.getScore("Science");
        System.out.println("Total score: " + totalScore);

        // Read the range data
        /* read */ String rangeValue = student.getRangeData(5);
        System.out.println("Range data for key 5: " + rangeValue);

        // Further operations
        student.addScore("History", 75);
        System.out.println("History score: " + student.getScore("History"));
    }
}