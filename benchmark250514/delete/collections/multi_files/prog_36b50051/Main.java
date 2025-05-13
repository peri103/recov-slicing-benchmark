public class Main {
    public static void main(String[] args) {
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        alice.addScore("Math", 95);
        bob.addScore("Math", 88);

        Course mathCourse = new Course("Math");
        mathCourse.enrollStudent(alice);
        mathCourse.enrollStudent(bob);

        for (Student student : mathCourse.getEnrolledStudents()) {
            System.out.println(student.getName() + "'s scores:");
            for (String subject : student.getScores().getSubjects()) {
                int score = student.getScores().getScore(subject);
                System.out.println(subject + ": " + score);
            }
        }
    }
}