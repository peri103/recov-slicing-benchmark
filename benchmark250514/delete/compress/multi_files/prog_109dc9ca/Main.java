import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarEntryManager manager = new TarEntryManager();
        
        TarArchiveEntry entry1 = new TarArchiveEntry("example1.txt");
        TarArchiveEntry entry2 = new TarArchiveEntry("example2.txt");
        
        manager.addEntry(entry1);
        manager.addEntry(entry2);
        
        manager.setGroupIdForEntry("example1.txt", 1000);
        
        // Additional complexity with Course class
        Course course = new Course("Computer Science");
        course.addStudent("Alice");
        course.addStudent("Bob");
        
        course.listStudents();
        
        TarArchiveEntry retrievedEntry = manager.getEntry("example1.txt");
        if (retrievedEntry != null) {
            /* read */ long groupId = retrievedEntry.getGroupId();
            System.out.println("Group ID of example1.txt: " + groupId);
        }
    }
}