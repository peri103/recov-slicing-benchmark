import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        /* write */ entry.setFileType(DumpArchiveEntry.TYPE_FILE);
        /* read */ int fileType = entry.getFileType();
        System.out.println(fileType);
    }
}