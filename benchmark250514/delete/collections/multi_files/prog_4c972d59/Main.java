public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        student1.addScore(95);
        student1.addScore(88);
        student2.addScore(78);
        student2.addScore(85);

        Course course = new Course("Math 101");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        course.printStudentDetails();
    }
}