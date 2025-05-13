import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore(95);

        Course mathCourse = new Course("Mathematics");
        mathCourse.enrollStudent(student);

        List<Student> students = mathCourse.getEnrolledStudents();
        for (Student enrolledStudent : students) {
            System.out.println("Student: " + enrolledStudent.getName());
            Multimap<String, Integer> scores = enrolledStudent.getScores().getScoreMap();
            /* read */ Integer mathScore = scores.get("math").iterator().next();
            System.out.println("Math Score: " + mathScore);
        }
    }
}