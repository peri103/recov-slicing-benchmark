import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test");
        List<CpioArchiveEntry> entryList = new ArrayList<>();
        Random random = new Random();

        // Create a list of entries with random sizes
        for (int i = 0; i < 5; i++) {
            CpioArchiveEntry newEntry = new CpioArchiveEntry("entry" + i);
            newEntry.setSize(random.nextInt(5000) + 1000);
            entryList.add(newEntry);
        }

        // Set the size for the main entry
        /* write */ entry.setSize(1024);

        // Perform some operations on the list of entries
        long totalSize = 0;
        for (CpioArchiveEntry e : entryList) {
            totalSize += e.getSize();
        }
        System.out.println("Total size of entryList: " + totalSize);

        // Simulate some complex logic
        int index = random.nextInt(entryList.size());
        CpioArchiveEntry selectedEntry = entryList.get(index);
        System.out.println("Selected entry size: " + selectedEntry.getSize());

        // Retrieve the size for the main entry
        /* read */ long size = entry.getSize();
        System.out.println("Main entry size: " + size);

        // Further operations on the entryList
        entryList.forEach(e -> e.setSize(e.getSize() + 500));
        totalSize = 0;
        for (CpioArchiveEntry e : entryList) {
            totalSize += e.getSize();
        }
        System.out.println("Updated total size of entryList: " + totalSize);
    }
}