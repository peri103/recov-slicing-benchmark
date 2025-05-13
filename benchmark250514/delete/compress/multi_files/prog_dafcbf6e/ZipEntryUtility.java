import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class ZipEntryUtility {
    public static void setEntryCrc(ZipArchiveEntry entry, long crc) {
        /* write */ entry.setCrc(crc);
    }

    public static long getEntryCrc(ZipArchiveEntry entry) {
        return entry.getCrc();
    }
}
