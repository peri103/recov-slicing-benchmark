import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry entry = new ZipArchiveEntry("example.txt");
        byte[] extraData = new byte[]{1, 2, 3, 4};

        // Additional code for complexity
        ZipArchiveEntry anotherEntry = new ZipArchiveEntry("anotherExample.txt");
        byte[] anotherExtraData = new byte[]{5, 6, 7, 8};
        anotherEntry.setExtra(anotherExtraData);

        int sum = 0;
        for (byte b : anotherEntry.getExtra()) {
            sum += b;
        }
        System.out.println("Sum of anotherEntry extra data: " + sum);

        // Manipulating arrays
        byte[] manipulatedData = Arrays.copyOf(extraData, extraData.length);
        for (int i = 0; i < manipulatedData.length; i++) {
            manipulatedData[i] *= 2;
        }
        
        // Original write-read pair
        /* write */ entry.setExtra(extraData);

        // More operations
        int product = 1;
        for (byte b : manipulatedData) {
            product *= b;
        }
        System.out.println("Product of manipulatedData: " + product);

        // Original read operation
        /* read */ byte[] readData = entry.getExtra();

        // Displaying read data
        System.out.print("Read data from entry: ");
        for (byte b : readData) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}