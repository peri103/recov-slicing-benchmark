import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a TarFileHandler and set file type
        TarFileHandler tarHandler = new TarFileHandler("example.txt");
        tarHandler.configureEntry(1024, 0644, 1000, 1000);
        tarHandler.setFileType(TarArchiveEntry.FILE_TYPE_NORMAL);

        // Create a student and enroll in courses
        Student student = new Student("John Doe");
        student.enrollCourse("Math");
        student.enrollCourse("Science");

        // Print student details
        System.out.println("Student: " + student.getName());
        System.out.println("Enrolled Courses: " + student.getCourses());

        // Perform unrelated operations
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            intList.add(i * 10);
        }

        for (int num : intList) {
            System.out.println("Number: " + num);
        }

        // Read the file type using the read method
        /* read */ int fileType = tarHandler.getFileType();
        System.out.println("File Type: " + fileType);
    }
}