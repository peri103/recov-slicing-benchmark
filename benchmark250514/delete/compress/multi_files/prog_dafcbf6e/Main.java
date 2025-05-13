import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipEntryManager manager = new ZipEntryManager();
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        ZipArchiveEntry zipEntry2 = new ZipArchiveEntry("example2.txt");

        ZipEntryUtility.setEntryCrc(zipEntry, 123456789L);
        ZipEntryUtility.setEntryCrc(zipEntry2, 987654321L);

        manager.addEntry(zipEntry);
        manager.addEntry(zipEntry2);

        ZipArchiveEntry firstEntry = manager.getEntry(0);
        /* read */ long crcValue = ZipEntryUtility.getEntryCrc(firstEntry);
        System.out.println("CRC of the first entry: " + crcValue);

        long totalCrc = 0;
        for (ZipArchiveEntry entry : manager.getAllEntries()) {
            totalCrc += ZipEntryUtility.getEntryCrc(entry);
        }
        System.out.println("Total CRC of all entries: " + totalCrc);
    }
}