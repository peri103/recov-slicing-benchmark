import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Initialize the CpioArchiveEntry object
        CpioArchiveEntry entry = new CpioArchiveEntry();

        // Define the extra data to be set
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};

        // Write the extra data to the entry
        /* write */ entry.setExtra(extraData);

        // Read the extra data from the entry
        /* read */ byte[] readData = entry.getExtra();

        // Print the read data to verify it matches the written data
        for (byte b : readData) {
            System.out.print(b + " ");
        }
    }
}