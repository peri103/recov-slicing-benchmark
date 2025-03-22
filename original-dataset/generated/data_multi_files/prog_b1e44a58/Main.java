public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course course = new Course("Mathematics");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        course.addStudentScore(student1, 95);
        course.addStudentScore(student2, 88);

        course.displayScores();

        /* read */ int score = student1.getScores().get(0);
        System.out.println("Read score for Alice: " + score);
    }
}