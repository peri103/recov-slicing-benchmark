import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};
        
        // Unrelated complex code begins
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum of numbers: " + sum);
        
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        
        for (String str : strings) {
            System.out.println(str);
        }
        // Unrelated complex code ends
        
        /* write */ gzipParams.setExtra(extraData);
        
        // More unrelated complex code
        ArrayList<Double> doubleList = new ArrayList<>();
        for (double d = 0.5; d < 5.0; d += 0.5) {
            doubleList.add(d);
        }
        
        double product = 1.0;
        for (Double d : doubleList) {
            product *= d;
        }
        
        System.out.println("Product of doubles: " + product);
        
        // Read operation
        /* read */ byte[] readExtraData = gzipParams.getExtra();
        
        System.out.print("Extra data: ");
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}