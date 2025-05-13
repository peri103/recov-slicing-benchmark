import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        /* write */ gzipParams.setISize(12345);
        
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }
        
        map.put("first", numbers.get(0));
        map.put("last", numbers.get(numbers.size() - 1));
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        int firstValue = map.get("first");
        int lastValue = map.get("last");
        
        System.out.println("Sum: " + sum);
        System.out.println("First value: " + firstValue);
        System.out.println("Last value: " + lastValue);
        
        // Perform some unrelated calculations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        
        System.out.println("Product of first 5 numbers: " + product);
        
        /* read */ int iSize = gzipParams.getISize();
        System.out.println("Gzip ISize: " + iSize);
    }
}