import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        ArrayList<String> stringList = new ArrayList<>();
        HashMap<String, Integer> stringLengthMap = new HashMap<>();

        // Populate the string list
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");

        // Calculate and store the lengths of strings in a map
        for (String str : stringList) {
            stringLengthMap.put(str, str.length());
        }

        // Perform some operations on the map
        for (String key : stringLengthMap.keySet()) {
            System.out.println("The length of " + key + " is " + stringLengthMap.get(key));
        }

        /* write */ gzipParameters.setHeaderCRC(true);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 0 to 9 is " + sum);

        // More operations on the list
        for (String str : stringList) {
            System.out.println("Uppercase of " + str + " is " + str.toUpperCase());
        }

        /* read */ boolean headerCRC = gzipParameters.getHeaderCRC();
        System.out.println("Header CRC is set to: " + headerCRC);

        // Additional operations
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numberList.add(i * i);
        }

        for (int number : numberList) {
            System.out.println("Square: " + number);
        }
    }
}