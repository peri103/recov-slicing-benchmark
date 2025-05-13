import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        
        /* write */ gzipParameters.setComment("This is a comment");
        
        ArrayList<String> list = new ArrayList<>();
        list.add("First element");
        list.add("Second element");
        
        for (String element : list) {
            System.out.println("Processing: " + element);
        }
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
            }
        }
        
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        /* read */ String comment = gzipParameters.getComment();
        
        System.out.println(comment);
        
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numberList.add(i * i);
        }
        
        for (int number : numberList) {
            System.out.println("Square: " + number);
        }
        
        System.out.println("Finished processing elements.");
    }
}