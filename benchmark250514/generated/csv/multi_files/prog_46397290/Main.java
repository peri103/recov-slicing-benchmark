public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        student1.addScore(85);

        Student student2 = new Student("Bob");
        student2.addScore(90);

        Course course = new Course("Mathematics");
        course.addStudent(student1);
        course.addStudent(student2);

        course.printStudentScores();
    }
}