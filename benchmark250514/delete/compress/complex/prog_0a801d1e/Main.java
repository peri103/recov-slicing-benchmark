import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.FlushMode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflateCompressorOutputStream deflateStream = new DeflateCompressorOutputStream(byteArrayOutputStream);

            // Additional code to increase complexity
            ArrayList<String> stringList = new ArrayList<>();
            stringList.add("Hello");
            stringList.add("World");
            
            HashMap<String, Integer> map = new HashMap<>();
            map.put("One", 1);
            map.put("Two", 2);

            for (String str : stringList) {
                System.out.println("String List Element: " + str);
            }

            for (String key : map.keySet()) {
                System.out.println("Map Key: " + key + ", Value: " + map.get(key));
            }

            /* write */ deflateStream.setFlushMode(FlushMode.SYNC_FLUSH);

            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);

            /* read */ FlushMode flushMode = deflateStream.getFlushMode();
            System.out.println("Flush Mode: " + flushMode);

            // More unrelated complex code
            ArrayList<Integer> numberList = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numberList.add(i * 2);
            }

            for (Integer number : numberList) {
                System.out.println("Number List Element: " + number);
            }

            deflateStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}