public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addScore(85);
        student2.addScore(90);

        Course course = new Course("Mathematics");
        course.addStudent(student1);
        course.addStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Scores for " + student.getScore(0));
        }
    }
}