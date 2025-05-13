import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 100);
        long lastModifiedTime = System.currentTimeMillis();
        
        /* write */ entry.setLastModified(lastModifiedTime);
        
        ArrayList<String> fileNames = new ArrayList<>();
        fileNames.add("file1.txt");
        fileNames.add("file2.txt");
        fileNames.add("file3.txt");
        
        HashMap<String, Integer> fileSizes = new HashMap<>();
        fileSizes.put("file1.txt", 150);
        fileSizes.put("file2.txt", 200);
        fileSizes.put("file3.txt", 300);
        
        ArArchiveEntry entry2 = new ArArchiveEntry(fileNames.get(1), fileSizes.get(fileNames.get(1)));
        
        for (String fileName : fileNames) {
            System.out.println("Processing: " + fileName);
        }
        
        long readLastModifiedTime = entry.getLastModified(); /* read */
        
        System.out.println("Last Modified Time of 'example.txt': " + readLastModifiedTime);
        
        int totalSize = 0;
        for (Integer size : fileSizes.values()) {
            totalSize += size;
        }
        
        System.out.println("Total size of files: " + totalSize);
        
        ArArchiveEntry entry3 = new ArArchiveEntry(fileNames.get(2), fileSizes.get(fileNames.get(2)));
        entry3.setLastModified(System.currentTimeMillis() + 1000);
        
        System.out.println("Last Modified Time of 'file3.txt': " + entry3.getLastModified());
    }
}