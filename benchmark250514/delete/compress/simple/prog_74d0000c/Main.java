import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        
        // Set the file type using the write method
        /* write */ entry.setFileType(TarArchiveEntry.FILE_TYPE_NORMAL);
        
        // Read the file type using the read method
        /* read */ int fileType = entry.getFileType();
        
        System.out.println("File Type: " + fileType);
    }
}