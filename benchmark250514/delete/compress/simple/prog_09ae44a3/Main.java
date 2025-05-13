import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.FlushMode;
import java.io.ByteArrayOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflateCompressorOutputStream deflateOutputStream = new DeflateCompressorOutputStream(byteArrayOutputStream);

            /* write */ deflateOutputStream.setFlushMode(FlushMode.SYNC_FLUSH);
            /* read */ FlushMode flushMode = deflateOutputStream.getFlushMode();
            
            System.out.println(flushMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}