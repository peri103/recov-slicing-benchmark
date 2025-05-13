import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        
        /* write */ zipEntry.setExternalAttributes(12345L);
        
        /* read */ long attributes = zipEntry.getExternalAttributes();
        
        System.out.println(attributes);
    }
}