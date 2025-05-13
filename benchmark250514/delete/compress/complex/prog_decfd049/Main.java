import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.FlushMode;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize DeflateCompressorOutputStream
        DeflateCompressorOutputStream deflateStream = new DeflateCompressorOutputStream(System.out);

        // Initialize another compressor stream for demonstration
        DeflateCompressorOutputStream anotherStream = new DeflateCompressorOutputStream(System.out);

        // Set flush mode to SYNC_FLUSH for the original stream
        /* write */ deflateStream.setFlushMode(FlushMode.SYNC_FLUSH);

        // Set flush mode to NO_FLUSH for the another stream
        anotherStream.setFlushMode(FlushMode.NO_FLUSH);

        // Create an ArrayList to store flush modes
        ArrayList<FlushMode> flushModes = new ArrayList<>();

        // Add flush mode of anotherStream to the list
        flushModes.add(anotherStream.getFlushMode());

        // Perform some unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // Add a few more operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 natural numbers: " + product);

        // Read the flush mode from the original stream
        /* read */ FlushMode flushMode = deflateStream.getFlushMode();

        // Add the read flush mode to the list
        flushModes.add(flushMode);

        // Print the flush modes stored in the list
        for (FlushMode mode : flushModes) {
            System.out.println("Stored FlushMode: " + mode);
        }
    }
}