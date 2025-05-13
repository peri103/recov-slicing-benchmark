import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("initial");
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("initial.zip");
        Map<String, Integer> fileSizes = new HashMap<>();

        fileSizes.put("initial", 1024);
        fileSizes.put("initial.zip", 2048);

        /* write */ jarEntry.setName("example.jar");

        fileSizes.put("example.jar", 4096);
        zipEntry.setName("example2.zip");
        fileSizes.put("example2.zip", 8192);

        for (Map.Entry<String, Integer> entry : fileSizes.entrySet()) {
            System.out.println("File: " + entry.getKey() + ", Size: " + entry.getValue());
        }

        /* read */ String name = jarEntry.getName();
        System.out.println("Jar Entry Name: " + name);

        int totalSize = 0;
        for (int size : fileSizes.values()) {
            totalSize += size;
        }
        System.out.println("Total Size: " + totalSize);

        String zipName = zipEntry.getName();
        System.out.println("Zip Entry Name: " + zipName);
    }
}