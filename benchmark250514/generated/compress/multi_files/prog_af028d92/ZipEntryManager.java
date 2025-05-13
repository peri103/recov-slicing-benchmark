import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.List;

public class ZipEntryManager {
    private List<ZipArchiveEntry> zipEntries;

    public ZipEntryManager() {
        this.zipEntries = new ArrayList<>();
    }

    public void addZipEntry(String name, long crc) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry(name);
        /* write */ zipEntry.setCrc(crc);
        zipEntries.add(zipEntry);
    }

    public List<ZipArchiveEntry> getZipEntries() {
        return zipEntries;
    }
}