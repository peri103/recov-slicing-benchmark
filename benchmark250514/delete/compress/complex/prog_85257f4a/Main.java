import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test");
        ArrayList<Integer> permissions = new ArrayList<>();
        
        // Adding some dummy permissions
        permissions.add(644);
        permissions.add(755);
        permissions.add(777);
        
        // Process the permissions
        for (int perm : permissions) {
            if (perm == 777) {
                /* write */ entry.setMode(perm);
            }
        }

        // Some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // More complex logic
        ArrayList<String> filenames = new ArrayList<>();
        filenames.add("file1.txt");
        filenames.add("file2.txt");
        filenames.add("file3.txt");

        for (String filename : filenames) {
            System.out.println("Processing file: " + filename);
        }

        // Retrieve the mode
        /* read */ int mode = entry.getMode();
        System.out.println("Mode set in the entry: " + mode);

        // Additional unrelated logic
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}