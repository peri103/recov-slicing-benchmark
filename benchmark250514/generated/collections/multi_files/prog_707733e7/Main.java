public class Main {
    public static void main(String[] args) {
        // Create a course
        Course course = new Course("Advanced Java Programming");

        // Create a student and add scores
        Student student1 = new Student("Alice");
        student1.addScore(85);
        student1.addScore(90);

        // Enroll student in the course
        course.enrollStudent(student1);

        // Retrieve and print student scores
        StudentScores studentScores = student1.getScores();
        /* read */ int score = studentScores.getUnmodifiableScoresMap().get("scores").iterator().next();
        System.out.println("First score for " + student1.getName() + ": " + score);

        // Additional operations for complexity
        Student student2 = new Student("Bob");
        student2.addScore(75);
        student2.addScore(80);
        course.enrollStudent(student2);

        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Student: " + student.getName());
            for (Integer s : student.getScores().getUnmodifiableScoresMap().get("scores")) {
                System.out.println("Score: " + s);
            }
        }
    }
}