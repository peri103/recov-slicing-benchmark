import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        
        Date modTime = new Date();
        /* write */ entry.setModTime(modTime);

        // Adding complexity with a list of TarArchiveEntry objects
        ArrayList<TarArchiveEntry> archiveEntries = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            TarArchiveEntry tempEntry = new TarArchiveEntry("file" + i + ".txt");
            tempEntry.setModTime(new Date(System.currentTimeMillis() - i * 1000));
            archiveEntries.add(tempEntry);
        }

        // Manipulate the list
        for (TarArchiveEntry e : archiveEntries) {
            System.out.println("File: " + e.getName() + ", ModTime: " + e.getModTime());
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * 2;
        }
        System.out.println("Sum of first 10 even numbers: " + sum);

        // Retrieve the modification time from the original entry
        /* read */ Date readModTime = entry.getModTime();
        System.out.println("Original entry modification time: " + readModTime);

        // Further operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}