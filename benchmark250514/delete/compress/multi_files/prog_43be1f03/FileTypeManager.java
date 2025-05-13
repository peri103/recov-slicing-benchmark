import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class FileTypeManager {
    private CpioArchiveEntry entry;

    public FileTypeManager(String name) {
        entry = new CpioArchiveEntry(name);
    }

    public void setFileType(int fileType) {
        /* write */ entry.setFileType(fileType);
    }

    public int getFileType() {
        return entry.getFileType();
    }
}