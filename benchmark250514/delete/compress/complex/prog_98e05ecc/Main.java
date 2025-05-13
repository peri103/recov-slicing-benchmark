import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        byte[] extraData = new byte[]{1, 2, 3, 4};

        /* write */ gzipParameters.setExtra(extraData);

        // Additional unrelated operations
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i * 10);
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        int sum = 0;
        for (Integer value : arrayList) {
            sum += value;
        }

        System.out.println("Sum of arrayList values: " + sum);

        int hashMapSum = 0;
        for (String key : hashMap.keySet()) {
            hashMapSum += hashMap.get(key);
        }

        System.out.println("Sum of hashMap values: " + hashMapSum);

        // More complex operations
        int product = 1;
        for (int i = 1; i <= 4; i++) {
            product *= i;
        }

        System.out.println("Product of numbers 1 to 4: " + product);

        // Retrieving the extra data from gzipParameters
        /* read */ byte[] readData = gzipParameters.getExtra();

        System.out.print("Read data from GzipParameters: ");
        for (byte b : readData) {
            System.out.print(b + " ");
        }
    }
}