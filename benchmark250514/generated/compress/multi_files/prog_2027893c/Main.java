import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Course javaCourse = new Course("Advanced Java");
        Student student1 = new Student("Alice", 1, javaCourse);
        Student student2 = new Student("Bob", 2, javaCourse);

        javaCourse.addStudent(student1);
        javaCourse.addStudent(student2);

        ZipExtraDataHandler zipHandler = new ZipExtraDataHandler("testEntry");
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};
        zipHandler.setExtraData(extraData);

        System.out.println("Course: " + javaCourse.getCourseName());
        for (Student student : javaCourse.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }

        /* read */ byte[] readData = zipHandler.getExtraData();
        System.out.print("Read Extra Data: ");
        for (byte b : readData) {
            System.out.print(b + " ");
        }
    }
}