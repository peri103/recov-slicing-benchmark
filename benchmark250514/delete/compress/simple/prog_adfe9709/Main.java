import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test", 1000);
        /* write */ entry.setFileType(CpioArchiveEntry.C_ISREG);
        /* read */ int fileType = entry.getFileType();
        System.out.println(fileType);
    }
}