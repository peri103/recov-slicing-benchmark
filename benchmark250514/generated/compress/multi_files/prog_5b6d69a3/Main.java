import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipEntryManager manager = new ZipEntryManager();
        manager.addEntry("example.txt", 1024L);
        manager.addEntry("anotherExample.txt", 2048L);
        
        Course course = new Course("Advanced Java Programming");
        course.addStudent("Alice");
        course.addStudent("Bob");
        
        System.out.println("Course: " + course.getCourseName());
        for (String student : course.getStudents()) {
            System.out.println("Student: " + student);
        }
        
        ZipArchiveEntry entry = manager.getEntry("example.txt");
        if (entry != null) {
            /* read */ long size = entry.getSize();
            System.out.println("Size of example.txt: " + size);
        }
        
        long totalSize = 0;
        for (ZipArchiveEntry zipEntry : manager.getAllEntries()) {
            totalSize += zipEntry.getSize();
        }
        
        System.out.println("Total size of all entries: " + totalSize);
    }
}