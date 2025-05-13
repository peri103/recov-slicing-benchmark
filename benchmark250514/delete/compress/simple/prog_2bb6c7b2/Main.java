import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        /* write */ entry.setFileType(TarArchiveEntry.FILE_TYPE_NORMAL);
        /* read */ int fileType = entry.getFileType();
        System.out.println("File Type: " + fileType);
    }
}