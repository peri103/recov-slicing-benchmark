import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.FlushMode;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize DeflateCompressorOutputStream with a dummy OutputStream
            DeflateCompressorOutputStream deflateStream = new DeflateCompressorOutputStream(System.out);

            // Initialize a map to simulate some complex operations
            Map<String, Integer> dataMap = new HashMap<>();
            dataMap.put("Key1", 100);
            dataMap.put("Key2", 200);

            // Simulate a processing step
            int sum = 0;
            for (Integer value : dataMap.values()) {
                sum += value;
            }
            System.out.println("Sum of values: " + sum);

            // Set the flush mode using the write method
            FlushMode flushModeToSet = FlushMode.SYNC_FLUSH;
            /* write */ deflateStream.setFlushMode(flushModeToSet);

            // Add more complex operations
            for (int i = 0; i < 3; i++) {
                int computedValue = i * 10;
                dataMap.put("Computed" + i, computedValue);
            }

            // Simulate another processing step
            for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }

            // Read the flush mode using the read method
            /* read */ FlushMode flushModeRead = deflateStream.getFlushMode();

            // Print the flush mode to verify
            System.out.println("Flush Mode: " + flushModeRead);

            // Close the stream
            deflateStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}