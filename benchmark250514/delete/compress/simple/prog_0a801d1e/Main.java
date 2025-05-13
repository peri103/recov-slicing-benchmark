import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.FlushMode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflateCompressorOutputStream deflateStream = new DeflateCompressorOutputStream(byteArrayOutputStream);

            /* write */ deflateStream.setFlushMode(FlushMode.SYNC_FLUSH);
            /* read */ FlushMode flushMode = deflateStream.getFlushMode();
            
            System.out.println(flushMode);

            deflateStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}