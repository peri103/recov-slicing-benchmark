import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.FlushMode;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize DeflateCompressorOutputStream with a dummy OutputStream
            DeflateCompressorOutputStream deflateStream = new DeflateCompressorOutputStream(System.out);

            // Set the flush mode using the write method
            FlushMode flushModeToSet = FlushMode.SYNC_FLUSH;
            /* write */ deflateStream.setFlushMode(flushModeToSet);

            // Read the flush mode using the read method
            /* read */ FlushMode flushModeRead = deflateStream.getFlushMode();

            // Print the flush mode to verify
            System.out.println(flushModeRead);

            // Close the stream
            deflateStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}