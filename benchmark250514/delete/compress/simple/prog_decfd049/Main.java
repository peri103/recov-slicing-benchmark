import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.FlushMode;

public class Main {
    public static void main(String[] args) {
        // Initialize DeflateCompressorOutputStream
        DeflateCompressorOutputStream deflateStream = new DeflateCompressorOutputStream(System.out);

        // Set flush mode to SYNC_FLUSH
        /* write */ deflateStream.setFlushMode(FlushMode.SYNC_FLUSH);

        // Read the flush mode
        /* read */ FlushMode flushMode = deflateStream.getFlushMode();

        // Print the flush mode
        System.out.println(flushMode);
    }
}