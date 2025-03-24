public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.storeScore(95);

        Course course = new Course("Computer Science");
        course.addStudent(student);

        course.listStudents();

        /* read */ int score = student.getScore();
        System.out.println("Alice's score: " + score);
    }
}