import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 1000);
        /* write */ entry.setCrc(12345678L);
        /* read */ long crcValue = entry.getCrc();
        System.out.println("CRC Value: " + crcValue);
    }
}