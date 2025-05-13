import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addScore("Algebra", 85);
        student2.addScore("Algebra", 90);

        course.addStudent(student1);
        course.addStudent(student2);

        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
            Integer score = student.getScore("Algebra");
            if (score != null) {
                System.out.println("Algebra Score: " + score);
            }
        }

        // Finally reading the original value
        /* read */ Integer aliceScore = student1.getScore("Algebra");
        System.out.println("Alice's Algebra Score: " + aliceScore);
    }
}