public class Main {
    public static void main(String[] args) {
        // Initialize RangeManager and add a range
        RangeManager rangeManager = new RangeManager();
        rangeManager.addRange(1, 10);

        // Build the range set
        ImmutableRangeSet<Integer> rangeSet = rangeManager.buildRangeSet();

        // Initialize RangeChecker with the built range set
        RangeChecker rangeChecker = new RangeChecker(rangeSet);

        // Check if a specific value is within the range
        boolean containsValue = rangeChecker.contains(5);
        System.out.println("Does the range contain 5? " + containsValue); // Should print true

        // Create a course and add students
        Course mathCourse = new Course("Mathematics");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        alice.addScore(85);
        bob.addScore(90);

        mathCourse.addStudent(alice);
        mathCourse.addStudent(bob);

        // Print student scores
        for (Student student : mathCourse.getStudents()) {
            System.out.println("Scores for " + student.getName() + ": " + student.getScores());
        }
    }
}