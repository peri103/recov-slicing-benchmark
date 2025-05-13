import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry entry = new JarArchiveEntry("example.jar");
        Map<String, Long> fileTimes = new HashMap<>();
        
        // Initialize a map with some file names and times
        fileTimes.put("file1.jar", 1627847287000L);
        fileTimes.put("file2.jar", 1627847297000L);
        
        // Perform some operations on the map
        for (Map.Entry<String, Long> fileTime : fileTimes.entrySet()) {
            System.out.println("File: " + fileTime.getKey() + ", Time: " + fileTime.getValue());
        }
        
        // Write the time to the JarArchiveEntry
        /* write */ entry.setTime(fileTimes.get("file1.jar"));
        
        // Perform more operations
        long sumOfTimes = 0;
        for (Long time : fileTimes.values()) {
            sumOfTimes += time;
        }
        
        System.out.println("Sum of times: " + sumOfTimes);
        
        // Read the time from the JarArchiveEntry
        /* read */ long time = entry.getTime();
        
        // Print the read time
        System.out.println("Read time from entry: " + time);
        
        // More operations
        fileTimes.put("file3.jar", time + 1000);
        
        for (Map.Entry<String, Long> fileTime : fileTimes.entrySet()) {
            System.out.println("Updated File: " + fileTime.getKey() + ", Time: " + fileTime.getValue());
        }
    }
}