import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        byte[] extraData = {0x01, 0x02, 0x03};
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        // Unrelated code to make the program more complex
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        list.add(10);
        list.add(20);
        list.add(30);
        
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        /* write */ gzipParameters.setExtra(extraData);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("List value: " + list.get(i));
        }

        // More unrelated code
        int sum = 0;
        for (int value : list) {
            sum += value;
        }
        System.out.println("Sum of list values: " + sum);

        /* read */ byte[] readExtraData = gzipParameters.getExtra();

        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
    }
}