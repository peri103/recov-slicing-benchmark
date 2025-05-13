import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflateCompressorOutputStream deflateStream = new DeflateCompressorOutputStream(byteArrayOutputStream);

            /* write */ deflateStream.setSyncFlush(true);
            /* read */ boolean syncFlushValue = deflateStream.getSyncFlush();
            
            System.out.println(syncFlushValue);
            
            deflateStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}