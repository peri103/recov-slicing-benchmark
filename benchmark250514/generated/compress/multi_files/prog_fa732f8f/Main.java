import java.util.List;

public class Main {
    public static void main(String[] args) {
        CompressionSettings compressionSettings = new CompressionSettings();
        compressionSettings.setCompressionLevel(5);

        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
        
        course.addStudent(student1);
        course.addStudent(student2);

        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
        }
        
        /* read */ int compressionLevel = compressionSettings.getCompressionLevel();
        System.out.println("Compression Level: " + compressionLevel);
    }
}