import org.apache.commons.compress.compressors.gzip.GzipParameters;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize GzipParameters
            GzipParameters gzipParams = new GzipParameters();
            // Set compressed size
            /* write */ gzipParams.setCompressedSize(1024);

            // Create a byte array to compress
            byte[] dataToCompress = "Hello, Gzip!".getBytes();

            // Compress the data
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GzipCompressorOutputStream gzipOutputStream = new GzipCompressorOutputStream(byteArrayOutputStream);
            gzipOutputStream.write(dataToCompress);
            gzipOutputStream.finish();

            // Get the compressed data
            byte[] compressedData = byteArrayOutputStream.toByteArray();

            // Initialize GzipParameters for decompression
            GzipParameters gzipParamsForDecompression = new GzipParameters();
            gzipParamsForDecompression.setCompressedSize(compressedData.length);

            // Decompress the data
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressedData);
            GzipCompressorInputStream gzipInputStream = new GzipCompressorInputStream(byteArrayInputStream);
            byte[] decompressedData = new byte[dataToCompress.length];
            gzipInputStream.read(decompressedData);

            // Print decompressed data
            System.out.println(new String(decompressedData));

            // Retrieve compressed size
            /* read */ long compressedSize = gzipParams.getCompressedSize();
            System.out.println("Compressed Size: " + compressedSize);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}