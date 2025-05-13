import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.Arrays;

public class ZipEntryManager {
    private ZipArchiveEntry entry;

    public ZipEntryManager(String fileName) {
        this.entry = new ZipArchiveEntry(fileName);
    }

    public void setExtraData(byte[] extraData) {
        /* write */ entry.setExtra(extraData);
    }

    public byte[] getExtraData() {
        return entry.getExtra();
    }
}
