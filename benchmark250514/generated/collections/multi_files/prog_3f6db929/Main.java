public class Main {
    public static void main(String[] args) {
        // Create students
        Student alice = new Student("Alice", 1);
        Student bob = new Student("Bob", 2);

        // Create a course and enroll students
        Course mathCourse = new Course("Mathematics");
        mathCourse.enrollStudent(alice);
        mathCourse.enrollStudent(bob);

        // Create student scores and add scores
        StudentScores studentScores = new StudentScores();
        studentScores.addScore(alice.getName(), 95);
        studentScores.addScore(bob.getName(), 88);

        // Retrieve and print scores
        int aliceScore = studentScores.getScore(alice.getName());
        int bobScore = studentScores.getScore(bob.getName());

        System.out.println(alice.getName() + "'s score in " + mathCourse.getCourseName() + ": " + aliceScore);
        System.out.println(bob.getName() + "'s score in " + mathCourse.getCourseName() + ": " + bobScore);
    }
}