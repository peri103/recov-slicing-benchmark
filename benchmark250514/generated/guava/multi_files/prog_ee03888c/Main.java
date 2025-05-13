public class Main {
    public static void main(String[] args) {
        // Create a student and enroll in a course
        Student student = new Student("John Doe");
        student.enrollInCourse("Physics");

        // Access the course and add scores
        Course course = student.getCourse();
        course.addScore(student.getName(), "assignment2", 90);

        // Finalize the scores to build the ImmutableTable
        course.finalizeScores();

        // Retrieve and print a score
        /* read */ Integer score = course.getScore("student1", "assignment1");
        System.out.println("Score for student1 on assignment1: " + score);

        // Retrieve and print another score
        Integer score2 = course.getScore("John Doe", "assignment2");
        System.out.println("Score for John Doe on assignment2: " + score2);
    }
}