import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        byte[] extraData = {1, 2, 3, 4, 5};

        /* write */ gzipParameters.setExtra(extraData);

        // Additional unrelated code to increase complexity
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(i * 2);
        }

        Map<String, Integer> exampleMap = new HashMap<>();
        for (int i = 0; i < numberList.size(); i++) {
            exampleMap.put("Key" + i, numberList.get(i));
        }

        int sum = 0;
        for (Integer value : numberList) {
            sum += value;
        }
        System.out.println("Sum of numberList: " + sum);

        for (Map.Entry<String, Integer> entry : exampleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        /* read */ byte[] readExtraData = gzipParameters.getExtra();

        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
        
        System.out.println("\nExtra operations:");
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println("Number at index " + i + ": " + numberList.get(i));
        }
    }
}