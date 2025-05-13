import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.FlushMode;

public class CompressorSettings {
    private DeflateCompressorOutputStream deflateStream;

    public CompressorSettings(DeflateCompressorOutputStream deflateStream) {
        this.deflateStream = deflateStream;
    }

    public void configureFlushMode(FlushMode mode) {
        /* write */ deflateStream.setFlushMode(mode);
    }
}
