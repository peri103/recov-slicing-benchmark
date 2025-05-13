import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveProcessor processor = new TarArchiveProcessor();
        processor.processEntry("example.txt");

        // Additional logic
        processor.processEntry("another_example.txt");

        // Retrieve the file type of the original entry
        /* read */ int fileType = processor.getEntryFileType("example.txt");
        System.out.println("Original entry file type: " + fileType);

        // More complex operations
        TarArchiveManager manager = new TarArchiveManager();
        TarArchiveEntry entry = new TarArchiveEntry("yet_another_example.txt");
        manager.addEntry(entry);
        System.out.println("File type of new entry: " + manager.getFileType("yet_another_example.txt"));
    }
}