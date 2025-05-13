import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        
        /* write */ gzipParameters.setOperatingSystem(3);
        
        // Additional code to make the program more complex
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(i * 2);
        }
        
        int sum = 0;
        for (int number : numberList) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // More operations on numberList
        numberList.remove(0);
        numberList.add(5, 100);
        
        int max = Integer.MIN_VALUE;
        for (int number : numberList) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Max number: " + max);
        
        // Returning to the original read operation
        /* read */ int os = gzipParameters.getOperatingSystem();
        
        System.out.println("Operating System: " + os);
        
        // Further complex operations
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        for (String str : stringList) {
            System.out.println(str);
        }
        
        stringList.set(1, "Java");
        
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}