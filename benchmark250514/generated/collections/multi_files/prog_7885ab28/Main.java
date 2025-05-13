public class Main {
    public static void main(String[] args) {
        MultiValueContainer container = new MultiValueContainer();
        Course course = new Course("Mathematics");

        container.addEntry("key", "value");

        course.addStudentScore("Alice", 85);
        course.addStudentScore("Bob", 90);

        System.out.println("Student Scores: " + course.getStudentScores());

        // Perform some operations on the course
        int totalScore = 0;
        for (int score : course.getStudentScores().values()) {
            totalScore += score;
        }
        System.out.println("Total Score: " + totalScore);

        // Retrieve entry from MultiValueContainer
        /* read */ Object value = container.getEntry("key");
        System.out.println("Retrieved Entry from MultiValueContainer: " + value);
    }
}