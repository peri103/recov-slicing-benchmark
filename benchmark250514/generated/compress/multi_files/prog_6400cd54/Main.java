import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Initialize ZipArchiveEntry
        ZipArchiveEntry entry = new ZipArchiveEntry("example.txt");

        // Create a course and add students
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addScore(85);
        student2.addScore(90);

        course.addStudent(student1);
        course.addStudent(student2);

        // Set Unix mode for the ZipArchiveEntry
        /* write */ entry.setUnixMode(0755);

        // More operations on students and courses
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Score: " + student.getScore(0));
        }

        // Read the Unix mode from the ZipArchiveEntry
        /* read */ int mode = entry.getUnixMode();
        System.out.println("Unix mode of example.txt: " + mode);
    }
}