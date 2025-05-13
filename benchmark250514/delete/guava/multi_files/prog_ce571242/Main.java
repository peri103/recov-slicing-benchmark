public class Main {
    public static void main(String[] args) {
        // Create a new course and students
        Course course = new Course("Mathematics");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Enroll students in the course
        course.enrollStudent(alice);
        course.enrollStudent(bob);

        // Add scores for students
        alice.addScore("Exam1", 85);
        bob.addScore("Exam1", 90);

        // Retrieve and print scores
        for (Student student : course.getStudents()) {
            System.out.println("Scores for " + student.getName() + ":");
            ImmutableMap<String, Integer> scores = student.getScores();
            /* read */ Integer score = scores.get("Exam1");
            System.out.println("Exam1: " + score);
        }
    }
}