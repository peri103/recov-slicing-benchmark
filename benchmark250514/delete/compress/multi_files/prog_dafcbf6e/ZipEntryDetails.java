import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class ZipEntryDetails {
    private ZipArchiveEntry zipEntry;

    public ZipEntryDetails(ZipArchiveEntry zipEntry) {
        this.zipEntry = zipEntry;
    }

    public void printDetails() {
        System.out.println("Entry Name: " + zipEntry.getName());
        System.out.println("Entry Size: " + zipEntry.getSize());
        /* read */ long crcValue = zipEntry.getCrc();
        System.out.println("CRC Value: " + crcValue);
    }
}
