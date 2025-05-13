import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Using the CommentWriter and CommentReader classes
        CommentWriter writer = new CommentWriter();
        writer.writeComment("This is a comment");

        // Adding unrelated complex code
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        ArrayList<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
        }

        // Using the CommentReader to read the comment
        CommentReader reader = new CommentReader();
        String comment = reader.readComment(writer.getOutput());
        System.out.println("Comment: " + comment);

        // Closing the writer
        writer.close();
    }
}