import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflateCompressorOutputStream deflateStream = new DeflateCompressorOutputStream(byteArrayOutputStream);

            byte[] dictionary = {1, 2, 3, 4, 5};
            /* write */ deflateStream.setDictionary(dictionary);

            /* read */ byte[] readDictionary = deflateStream.getDictionary();
            System.out.println(Arrays.toString(readDictionary));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}