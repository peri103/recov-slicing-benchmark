import com.google.common.collect.ImmutableRangeSet;

public class Main {
    public static void main(String[] args) {
        // Create a RangeSetBuilder and add a range
        RangeSetBuilder rangeSetBuilder = new RangeSetBuilder();
        rangeSetBuilder.addRange(1, 10);

        // Build the ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = rangeSetBuilder.build();

        // Create a RangeSetChecker to check if a value is within the range
        RangeSetChecker rangeSetChecker = new RangeSetChecker(rangeSet);

        // Create a student and add scores
        Student student = new Student("Alice");
        student.addScore(85);
        student.addScore(90);

        // Check if a specific value is within the range
        /* read */ boolean containsValue = rangeSetChecker.contains(5);
        System.out.println("RangeSet contains 5: " + containsValue);

        // Print student details
        System.out.println("Student: " + student.getName());
        System.out.println("Scores: " + student.getScores());
    }
}