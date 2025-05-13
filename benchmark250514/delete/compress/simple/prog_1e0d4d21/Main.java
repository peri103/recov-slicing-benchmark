import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateParameters;
import java.io.ByteArrayOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize necessary objects
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflateParameters parameters = new DeflateParameters();
            DeflateCompressorOutputStream deflateStream = new DeflateCompressorOutputStream(byteArrayOutputStream, parameters);

            // Set flush mode
            int flushMode = DeflateCompressorOutputStream.NO_FLUSH;
            /* write */ deflateStream.setFlushMode(flushMode);

            // Get flush mode
            /* read */ int readFlushMode = deflateStream.getFlushMode();

            // Output the flush mode to verify
            System.out.println("Flush Mode: " + readFlushMode);

            // Close the stream
            deflateStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}