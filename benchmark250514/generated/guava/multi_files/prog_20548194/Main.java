import com.google.common.collect.ImmutableRangeSet;

public class Main {
    public static void main(String[] args) {
        // Use RangeSetBuilder to create a range set
        RangeSetBuilder rangeSetBuilder = new RangeSetBuilder();
        rangeSetBuilder.addRange(1, 10);
        ImmutableRangeSet<Integer> rangeSet = rangeSetBuilder.build();

        // Use RangeSetChecker to check if a value is in the range set
        RangeSetChecker rangeSetChecker = new RangeSetChecker(rangeSet);
        boolean contains = rangeSetChecker.contains(5);
        System.out.println("Does the range set contain 5? " + contains);

        // Create a student and manage scores
        Student student = new Student("Alice");
        student.addScore(85);
        student.addScore(90);

        System.out.println("Scores for " + student.getName() + ":");
        for (int score : student.getScores()) {
            System.out.println(score);
        }
    }
}