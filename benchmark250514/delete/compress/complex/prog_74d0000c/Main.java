import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a TarArchiveEntry
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        
        // More complex operations using TarArchiveEntry
        entry.setSize(1024);
        entry.setMode(0644);
        entry.setUserId(1000);
        entry.setGroupId(1000);
        
        // Unrelated operations with ArrayList
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        for (String str : stringList) {
            System.out.println(str);
        }
        
        // Set the file type using the write method
        /* write */ entry.setFileType(TarArchiveEntry.FILE_TYPE_NORMAL);
        
        // Perform other operations
        entry.setLinkName("link_example");
        entry.setModTime(System.currentTimeMillis());
        
        // Operations with another ArrayList
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            intList.add(i * 10);
        }
        
        for (int num : intList) {
            System.out.println("Number: " + num);
        }
        
        // Read the file type using the read method
        /* read */ int fileType = entry.getFileType();
        
        System.out.println("File Type: " + fileType);
        
        // More operations with TarArchiveEntry
        entry.setSize(2048);
        entry.setMode(0755);
        
        // Final operations with ArrayList
        ArrayList<Double> doubleList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            doubleList.add(i * 3.14);
        }
        
        for (double d : doubleList) {
            System.out.println("Double: " + d);
        }
    }
}