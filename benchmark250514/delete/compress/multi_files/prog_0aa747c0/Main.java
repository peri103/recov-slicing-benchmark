import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GzipParametersWrapper gzipWrapper = new GzipParametersWrapper();

        byte[] extraData = {10, 20, 30, 40, 50};
        gzipWrapper.setExtraData(extraData);

        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        Course course = new Course("Computer Science");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        /* read */ byte[] readExtraData = gzipWrapper.getExtraData();
        System.out.print("Read extra data: ");
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}