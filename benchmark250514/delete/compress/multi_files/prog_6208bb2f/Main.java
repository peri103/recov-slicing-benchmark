import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Using the GzipParametersWrapper
        GzipParametersWrapper gzipWrapper = new GzipParametersWrapper();
        gzipWrapper.setCRC32(123456789);

        // Creating a Course and adding Students
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 20, course);
        Student student2 = new Student("Bob", 22, course);

        course.addStudent(student1);
        course.addStudent(student2);

        // Printing course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Ensuring the read is executed only once and far from the write
        /* read */ long crcValue = gzipWrapper.getCRC32();
        System.out.println("CRC32 Value: " + crcValue);
    }
}