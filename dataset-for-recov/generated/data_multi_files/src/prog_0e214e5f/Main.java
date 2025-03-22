public class Main {
    public static void main(String[] args) {
        // Create a new course
        Course course = new Course("Mathematics");

        // Create students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Add scores for students
        alice.addScore("Algebra", 95);
        bob.addScore("Geometry", 88);

        // Add students to the course
        course.addStudent(alice);
        course.addStudent(bob);

        // Retrieve and print scores
        for (Student student : course.getStudents()) {
            System.out.println("Scores for " + student.getName() + ":");
            // Original read operation
            /* read */ int score = student.getScores().getScore("Algebra");
            System.out.println("Algebra: " + score);
        }
    }
}