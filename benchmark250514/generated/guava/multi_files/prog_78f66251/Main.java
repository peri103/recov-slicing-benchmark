public class Main {
    public static void main(String[] args) {
        // Create a student and enroll in a course
        Student student = new Student("Alice");
        student.enrollCourse("Mathematics");

        // Add scores for the student
        student.addScore(95);
        student.addScore(88);

        // Retrieve and print the course name
        String courseName = student.getCourseName();
        System.out.println("Course: " + courseName);

        // Retrieve and print scores
        int firstScore = student.getScore(0);
        System.out.println("First Score: " + firstScore);

        // Use StudentScores to store and retrieve a score
        StudentScores studentScores = new StudentScores();
        Class<Integer> scoreClass = Integer.class;
        Integer scoreValue = 100;

        studentScores.addScore(scoreClass, scoreValue);
        Integer retrievedScore = studentScores.getScore(scoreClass);
        System.out.println("Retrieved Score: " + retrievedScore);
    }
}