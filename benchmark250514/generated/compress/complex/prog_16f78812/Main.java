import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry entry = new ZipArchiveEntry("example.txt");
        ArrayList<Integer> attributeHistory = new ArrayList<>();

        /* write */ entry.setExternalAttributes(0x20);

        // Complex operations using ArrayList
        for (int i = 0; i < 5; i++) {
            attributeHistory.add(i * 10);
        }

        int sumOfAttributes = 0;
        for (int attr : attributeHistory) {
            sumOfAttributes += attr;
        }

        System.out.println("Sum of attributes: " + sumOfAttributes);

        // Additional operations on ZipArchiveEntry
        ZipArchiveEntry anotherEntry = new ZipArchiveEntry("another_example.txt");
        anotherEntry.setExternalAttributes(0x40);
        long anotherAttributes = anotherEntry.getExternalAttributes();
        System.out.println("Another entry attributes: " + anotherAttributes);

        /* read */ long attributes = entry.getExternalAttributes();

        System.out.println("Original entry attributes: " + attributes);
    }
}