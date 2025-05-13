import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class ZipCommentManager {
    private ZipArchiveEntry entry;

    public ZipCommentManager(String fileName) {
        this.entry = new ZipArchiveEntry(fileName);
    }

    public void setComment(String comment) {
        /* write */ entry.setComment(comment);
    }

    public String getComment() {
        return entry.getComment();
    }
}
