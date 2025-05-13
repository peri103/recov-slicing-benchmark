import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TitleManager titleManager = new TitleManager();
        titleManager.updateTitle("Welcome to the Course!");

        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        course.addStudent(student1);
        course.addStudent(student2);

        ArrayList<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }

        /* read */ String titleText = titleManager.retrieveTitle();
        System.out.println("Course Title: " + titleText);
    }
}