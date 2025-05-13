import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ZipEntryManager zipManager = new ZipEntryManager();
        zipManager.addZipEntry("example.txt", 123456789L);
        zipManager.addZipEntry("example2.txt", 987654321L);
        zipManager.addZipEntry("example3.txt", 192837465L);

        List<ZipArchiveEntry> zipEntries = zipManager.getZipEntries();

        // Print all CRC values
        for (ZipArchiveEntry entry : zipEntries) {
            System.out.println("CRC of " + entry.getName() + ": " + entry.getCrc());
        }

        // Create a course and add students to it
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));

        // Print student details
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getStudentId());
        }

        // Retrieve and print the CRC value of the first ZipArchiveEntry
        /* read */ long crcValue = zipEntries.get(0).getCrc();
        System.out.println("CRC of the first entry: " + crcValue);
    }
}