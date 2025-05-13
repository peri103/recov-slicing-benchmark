import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Create a RangeOperations instance
        RangeOperations rangeOps = new RangeOperations();
        rangeOps.addRange(1, 10);

        // Create a Student instance
        Student student = new Student("Alice");
        student.addScore("Math", 95);
        student.addScore("Science", 88);

        // Display student scores
        ImmutableSet<String> subjects = ImmutableSet.of("Math", "Science");
        for (String subject : subjects) {
            System.out.println(student.getName() + "'s score in " + subject + ": " + student.getScore(subject));
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("Sum after adding " + i + " is: " + sum);
        }

        // Check if a value is in the range
        /* read */ boolean contains = rangeOps.containsValue(5);
        System.out.println("Range contains 5: " + contains);
    }
}