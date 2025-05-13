import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.FlushMode;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflateCompressorOutputStream deflateStream = new DeflateCompressorOutputStream(byteArrayOutputStream);

            HashMap<String, Integer> map = new HashMap<>();
            ArrayList<Integer> list = new ArrayList<>();

            map.put("key1", 100);
            map.put("key2", 200);
            list.add(10);
            list.add(20);

            /* write */ deflateStream.setFlushMode(FlushMode.SYNC_FLUSH);

            int sum = 0;
            for (Integer value : map.values()) {
                sum += value;
            }

            for (Integer number : list) {
                sum += number;
            }

            System.out.println("Sum: " + sum);

            String flushModeStr = "Flush mode is: ";
            /* read */ FlushMode flushMode = deflateStream.getFlushMode();
            flushModeStr += flushMode.toString();

            System.out.println(flushModeStr);

            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) * 2);
            }

            for (Integer number : list) {
                System.out.println("List value: " + number);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}