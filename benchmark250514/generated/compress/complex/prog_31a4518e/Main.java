import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");
        /* write */ jarEntry.setUnixMode(0755);

        // Additional complex code
        Map<String, Integer> permissionsMap = new HashMap<>();
        permissionsMap.put("example.jar", 0755);
        permissionsMap.put("another.jar", 0644);

        int defaultMode = 0644;
        String fileName = "example.jar";
        int retrievedMode = permissionsMap.getOrDefault(fileName, defaultMode);

        if (retrievedMode == jarEntry.getUnixMode()) {
            System.out.println("The mode matches the default.");
        } else {
            System.out.println("The mode does not match the default.");
        }

        // More complex logic
        for (Map.Entry<String, Integer> entry : permissionsMap.entrySet()) {
            System.out.println("File: " + entry.getKey() + ", Mode: " + entry.getValue());
        }

        // Separate block of logic
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 numbers: " + sum);

        // Retrieve the Unix mode set earlier
        /* read */ int unixMode = jarEntry.getUnixMode();
        System.out.println("Unix Mode of example.jar: " + unixMode);
    }
}