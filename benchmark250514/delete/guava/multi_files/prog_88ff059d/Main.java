public class Main {
    public static void main(String[] args) {
        // Create course and students
        Course mathCourse = new Course("Mathematics");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Enroll students in the course
        mathCourse.enrollStudent(alice);
        mathCourse.enrollStudent(bob);

        // Add scores for students
        alice.addScore("Math", 95);
        bob.addScore("Math", 85);

        // Retrieve and print scores
        for (Student student : mathCourse.getEnrolledStudents()) {
            int score = student.getScore("Math");
            System.out.println(student.getName() + "'s Math score: " + score);
        }
    }
}