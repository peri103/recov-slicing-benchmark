import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");
        byte[] extraData = {1, 2, 3, 4};

        /* write */ jarEntry.setExtra(extraData);

        // Simulate some unrelated complex logic
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, s.length());
        }

        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.zip");
        byte[] zipExtraData = {5, 6, 7, 8};
        zipEntry.setExtra(zipExtraData);
        
        // More complex logic
        int sumOfLengths = 0;
        for (String key : map.keySet()) {
            sumOfLengths += map.get(key);
        }
        
        // Read from the original jarEntry
        /* read */ byte[] readData = jarEntry.getExtra();
        
        for (byte b : readData) {
            System.out.print(b + " ");
        }
        
        // Continue with other operations
        System.out.println("\nSum of lengths: " + sumOfLengths);
        
        // Read from the zipEntry
        byte[] readZipData = zipEntry.getExtra();
        for (byte b : readZipData) {
            System.out.print(b + " ");
        }
    }
}