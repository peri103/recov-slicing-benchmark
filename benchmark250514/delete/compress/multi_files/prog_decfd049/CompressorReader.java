import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.FlushMode;

public class CompressorReader {
    private DeflateCompressorOutputStream deflateStream;

    public CompressorReader(DeflateCompressorOutputStream deflateStream) {
        this.deflateStream = deflateStream;
    }

    public FlushMode readFlushMode() {
        /* read */ return deflateStream.getFlushMode();
    }
}
