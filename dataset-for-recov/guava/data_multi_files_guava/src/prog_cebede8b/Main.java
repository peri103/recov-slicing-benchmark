public class Main {
    public static void main(String[] args) {
        StudentScores studentScores = new StudentScores();
        Student student = new Student("Alice");
        Course course = new Course("Math");

        // Enroll student in the course
        course.enrollStudent(student);

        // Add score for the student in the course
        studentScores.addScore(student.name, course.courseName, 95);
        
        // Retrieve and print the score
        int score = studentScores.getScore(student.name, course.courseName);
        System.out.println("Score of " + student.name + " in " + course.courseName + ": " + score);
    }
}