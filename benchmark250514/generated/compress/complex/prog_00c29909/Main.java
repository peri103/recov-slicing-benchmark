import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        
        // Create a map to simulate storing different operating systems
        Map<Integer, String> osMap = new HashMap<>();
        osMap.put(0, "Unknown");
        osMap.put(1, "Amiga");
        osMap.put(2, "VMS");
        osMap.put(3, "Unix");
        osMap.put(4, "VM/CMS");
        osMap.put(5, "Atari TOS");
        osMap.put(6, "OS/2");
        osMap.put(7, "Macintosh");
        osMap.put(8, "Z-System");
        osMap.put(9, "CP/M");
        osMap.put(10, "TOPS-20");
        osMap.put(11, "NTFS");
        osMap.put(12, "QDOS");
        osMap.put(13, "Acorn RISCOS");
        osMap.put(255, "Unknown");

        // Set the operating system to Unix
        /* write */ gzipParameters.setOperatingSystem(3);

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 100: " + sum);

        // Use the map to retrieve operating system name
        int osCode = gzipParameters.getOperatingSystem();
        String osName = osMap.get(osCode);
        System.out.println("Operating System Name: " + osName);

        // Perform additional operations
        int[] numbers = {5, 10, 15, 20, 25};
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of numbers: " + product);

        // Retrieve the operating system code
        /* read */ int osValue = gzipParameters.getOperatingSystem();
        System.out.println("Operating System Code: " + osValue);
    }
}