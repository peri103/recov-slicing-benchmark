public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Mathematics");

        course.enrollStudent(student);
        student.addScore("Mathematics", 95);

        course.listStudents();

        // Get the score for the student in Mathematics
        /* read */ int score = student.getScore("Mathematics");
        System.out.println("Score for " + student.getName() + " in " + course.getCourseName() + ": " + score);
    }
}