import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the CpioArchiveEntry object
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioArchiveEntry.CPIO_NEW);
        
        // Use the write method to set the name
        /* write */ entry.setName("exampleName");

        // Create an ArrayList to store multiple CpioArchiveEntry objects
        ArrayList<CpioArchiveEntry> entryList = new ArrayList<>();
        
        // Add multiple entries to the list
        for (int i = 0; i < 5; i++) {
            CpioArchiveEntry tempEntry = new CpioArchiveEntry(CpioArchiveEntry.CPIO_NEW);
            tempEntry.setName("entry" + i);
            entryList.add(tempEntry);
        }
        
        // Manipulate the list
        for (CpioArchiveEntry e : entryList) {
            System.out.println("Processing: " + e.getName());
        }
        
        // Perform some operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Use the read method to get the name
        /* read */ String name = entry.getName();

        // Print the name to verify the read value
        System.out.println("Read name: " + name);
        
        // Further complex operations
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(i * i);
        }
        
        for (Integer num : numberList) {
            System.out.println("Square: " + num);
        }
    }
}