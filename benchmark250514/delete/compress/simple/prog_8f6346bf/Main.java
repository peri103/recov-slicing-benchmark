import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        
        /* write */ zipEntry.setExternalAttributes(12345);
        
        /* read */ int externalAttributes = zipEntry.getExternalAttributes();
        
        System.out.println("External Attributes: " + externalAttributes);
    }
}