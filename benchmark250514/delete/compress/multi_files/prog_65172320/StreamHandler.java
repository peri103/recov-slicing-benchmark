import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class StreamHandler {
    private BZip2CompressorInputStream bzip2Stream;

    public StreamHandler() throws IOException {
        // Initialize with an empty ByteArrayInputStream, as we are not performing real compression
        bzip2Stream = new BZip2CompressorInputStream(new ByteArrayInputStream(new byte[0]));
    }

    public void setStreamSize(int size) {
        /* write */ bzip2Stream.setStreamSize(size);
    }

    public int getStreamSize() {
        /* read */ return bzip2Stream.getStreamSize();
    }
}
