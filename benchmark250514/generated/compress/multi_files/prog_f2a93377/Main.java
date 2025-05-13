import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipEntryManager manager = new ZipEntryManager();
        manager.addEntry("example.txt", 644);
        manager.addEntry("another_example.txt", 755);

        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        
        course.addStudent(student1);
        course.addStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getStudentID());
        }

        ZipArchiveEntry entry = manager.getEntry(0);
        /* read */ int mode = entry.getUnixMode();
        System.out.println("Unix mode of " + entry.getName() + ": " + mode);

        for (ZipArchiveEntry zipEntry : manager.getAllEntries()) {
            System.out.println("Entry: " + zipEntry.getName() + ", Unix Mode: " + zipEntry.getUnixMode());
        }
    }
}