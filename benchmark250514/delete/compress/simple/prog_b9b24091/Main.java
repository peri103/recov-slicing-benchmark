import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 100);
        /* write */ entry.setFileType(ArArchiveEntry.FILE_TYPE_REGULAR);
        /* read */ int fileType = entry.getFileType();
        System.out.println(fileType);
    }
}