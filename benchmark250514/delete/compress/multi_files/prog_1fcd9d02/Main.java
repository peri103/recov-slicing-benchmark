public class Main {
    public static void main(String[] args) {
        // Initialize JarCommentManager
        JarCommentManager jarManager = new JarCommentManager("example.jar");
        jarManager.setComment("This is a test comment");

        // Initialize Course and Students
        Course course = new Course("Computer Science");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Add scores to students
        alice.addScore(85);
        alice.addScore(90);
        bob.addScore(78);
        bob.addScore(82);

        // Add students to course
        course.addStudent(alice);
        course.addStudent(bob);

        // Print total scores of students
        for (Student student : course.getStudents()) {
            System.out.println(student.getName() + "'s Total Score: " + student.getTotalScore());
        }

        // Retrieve and print the comment from JarCommentManager
        /* read */ String comment = jarManager.getComment();
        System.out.println("Jar Comment: " + comment);
    }
}