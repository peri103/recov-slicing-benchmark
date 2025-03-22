public class Main {
    public static void main(String[] args) {
        // Create a course
        Course course = new Course("Mathematics");

        // Create students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Add scores to students
        alice.addScore(85);
        bob.addScore(90);

        // Add students to the course
        course.addStudent(alice);
        course.addStudent(bob);

        // Retrieve and print scores for each student in the course
        for (Student student : course.getStudents()) {
            System.out.println("Scores for " + student.getName() + ":");
            for (int score : student.getScores().getAllScores()) {
                System.out.println(score);
            }
        }

        // Read the first score of Alice
        /* read */ int firstScoreAlice = alice.getScores().getScore(0);
        System.out.println("First score of Alice: " + firstScoreAlice);
    }
}