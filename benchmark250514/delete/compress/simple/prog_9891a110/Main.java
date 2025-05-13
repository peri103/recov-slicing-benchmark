import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflateCompressorOutputStream deflateStream = new DeflateCompressorOutputStream(byteArrayOutputStream);
            
            byte[] dictionary = {1, 2, 3, 4, 5};
            /* write */ deflateStream.setDictionary(dictionary);
            
            /* read */ byte[] readDictionary = deflateStream.getDictionary();
            for (byte b : readDictionary) {
                System.out.print(b + " ");
            }
            
            deflateStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}