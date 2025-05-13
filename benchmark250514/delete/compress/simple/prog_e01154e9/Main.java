import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Create an instance of CpioArchiveEntry
        CpioArchiveEntry entry = new CpioArchiveEntry();

        // Write operation: Set user ID
        /* write */ entry.setUserId(1001);

        // Read operation: Get user ID
        /* read */ int userId = entry.getUserId();

        // Print the user ID to verify the read operation
        System.out.println(userId);
    }
}