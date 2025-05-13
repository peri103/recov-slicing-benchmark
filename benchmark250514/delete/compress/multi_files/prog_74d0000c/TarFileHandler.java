import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class TarFileHandler {
    private TarArchiveEntry entry;

    public TarFileHandler(String fileName) {
        entry = new TarArchiveEntry(fileName);
    }

    public void setFileType(int fileType) {
        /* write */ entry.setFileType(fileType);
    }

    public int getFileType() {
        return entry.getFileType();
    }

    public void configureEntry(int size, int mode, int userId, int groupId) {
        entry.setSize(size);
        entry.setMode(mode);
        entry.setUserId(userId);
        entry.setGroupId(groupId);
    }
}
