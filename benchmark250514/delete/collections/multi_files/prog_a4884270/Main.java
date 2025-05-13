public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore("Math", 95);
        student.addScore("Science", 88);

        Course course = new Course("Computer Science");
        course.enrollStudent(student);

        System.out.println("Course: " + course.getCourseName());
        for (Student enrolledStudent : course.getEnrolledStudents()) {
            System.out.println("Student: " + enrolledStudent.getName());
            System.out.println("Scores: " + enrolledStudent.getScores().getScores());
            System.out.println("Math Score: " + enrolledStudent.getScores().getScore("Math"));
        }
    }
}