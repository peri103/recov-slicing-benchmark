import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.FlushMode;
import java.io.ByteArrayOutputStream;

public class CompressorManager {
    private DeflateCompressorOutputStream deflateStream;

    public CompressorManager() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        deflateStream = new DeflateCompressorOutputStream(byteArrayOutputStream);
    }

    public void setFlushMode(FlushMode mode) {
        /* write */ deflateStream.setFlushMode(mode);
    }

    public FlushMode getFlushMode() {
        return deflateStream.getFlushMode();
    }
}
