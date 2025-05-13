import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Manage ZipArchiveEntry
        ZipEntryManager zipManager = new ZipEntryManager("example.txt");
        byte[] extraData = new byte[]{1, 2, 3, 4};
        zipManager.setExtraData(extraData);

        // Create and manage students and courses
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        Course course = new Course("Computer Science");
        course.addStudent(student1);
        course.addStudent(student2);

        // Print student details
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }

        // Retrieve extra data from ZipArchiveEntry
        /* read */ byte[] readData = zipManager.getExtraData();
        
        // Output read data
        System.out.print("Read data: ");
        for (byte b : readData) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}