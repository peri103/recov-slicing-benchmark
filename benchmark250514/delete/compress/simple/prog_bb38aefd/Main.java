import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry tarEntry = new TarArchiveEntry("example.txt");
        /* write */ tarEntry.setFileType(TarArchiveEntry.FILE_TYPE_NORMAL);
        /* read */ int fileType = tarEntry.getFileType();
        System.out.println(fileType);
    }
}