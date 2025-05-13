import java.util.List;

public class Main {
    public static void main(String[] args) {
        TextManipulator textManipulator = new TextManipulator("Hello World");
        textManipulator.deleteText(5, 11);

        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        Course course = new Course("Java Programming");
        course.addStudent(student1);
        course.addStudent(student2);

        System.out.println("Course: " + course.getCourseName());
        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getStudentId());
        }

        /* read */ String result = textManipulator.getText();
        System.out.println("Modified Text: " + result);
    }
}