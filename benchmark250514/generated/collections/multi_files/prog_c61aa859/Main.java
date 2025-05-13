public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore(42);

        Course course = new Course("Math 101");
        course.enrollStudent(student);

        for (Student s : course.getEnrolledStudents()) {
            System.out.println("Student: " + s.getName());
            int scoreCount = s.getScoreCount(42);
            System.out.println("Score 42 count: " + scoreCount);
        }
    }
}