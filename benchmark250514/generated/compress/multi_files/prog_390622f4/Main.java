import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", "alice.tar");
        Student student2 = new Student("Bob", "bob.tar");

        student1.assignToGroup("developers");
        student2.assignToGroup("testers");

        course.addStudent(student1);
        course.addStudent(student2);

        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
            /* read */ String groupName = student.getGroupName();
            System.out.println("Group: " + groupName);
        }
    }
}