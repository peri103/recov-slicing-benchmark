import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Initialize the CpioArchiveEntry object
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioArchiveEntry.CPIO_NEW);

        // Use the write method to set the name
        /* write */ entry.setName("exampleName");

        // Use the read method to get the name
        /* read */ String name = entry.getName();

        // Print the name to verify the read value
        System.out.println(name);
    }
}