import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("testfile.txt");
        CpioArchiveEntry entry2 = new CpioArchiveEntry("anotherfile.txt");
        
        // Set Unix mode for entry2
        entry2.setUnixMode(0644);

        // Create a variable to hold a mode value
        int modeValue = CpioConstants.C_ISREG;

        // Perform some unrelated operations
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Set Unix mode for entry
        /* write */ entry.setUnixMode(0755);

        // Perform operations using entry2
        int mode2 = entry2.getUnixMode();
        System.out.println("Unix Mode of entry2: " + mode2);

        // Perform more unrelated operations
        String[] words = {"apple", "banana", "cherry"};
        for (String word : words) {
            System.out.println("Word: " + word);
        }

        // Read Unix mode from entry
        /* read */ int mode = entry.getUnixMode();
        System.out.println("Unix Mode of entry: " + mode);
    }
}