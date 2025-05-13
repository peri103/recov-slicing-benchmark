public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore("Math", 95);

        Course course = new Course("Mathematics");
        course.enrollStudent(student);

        for (Student enrolledStudent : course.getEnrolledStudents()) {
            System.out.println("Student: " + enrolledStudent.getName());
            StudentScores scores = enrolledStudent.getScores();
            /* read */ int mathScore = scores.getScore("Math");
            System.out.println("Math Score: " + mathScore);
        }
    }
}