import java.util.HashMap;
import java.util.Map;

public class FileManager {
    private Map<String, ZipMetadata> files = new HashMap<>();

    public void addFile(String fileName, long crc) {
        ZipMetadata metadata = new ZipMetadata(fileName);
        metadata.setCrc(crc);
        files.put(fileName, metadata);
    }

    public ZipMetadata getFile(String fileName) {
        return files.get(fileName);
    }

    public void printFileDetails(String fileName) {
        ZipMetadata metadata = getFile(fileName);
        if (metadata != null) {
            System.out.println("File Name: " + metadata.getFileName());
            System.out.println("CRC Value: " + metadata.getCrc());
            System.out.println("Size: " + metadata.getSize());
            System.out.println("Compressed Size: " + metadata.getCompressedSize());
        } else {
            System.out.println("File not found.");
        }
    }
}
