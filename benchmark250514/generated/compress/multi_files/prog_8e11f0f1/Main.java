import java.util.List;

public class Main {
    public static void main(String[] args) {
        TarEntryManager manager = new TarEntryManager("example.txt");
        manager.setUserName("exampleUser");

        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        course.addStudent(student1);
        course.addStudent(student2);

        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }

        /* read */ String userName = manager.getUserName();
        System.out.println("Original entry username: " + userName);
    }
}