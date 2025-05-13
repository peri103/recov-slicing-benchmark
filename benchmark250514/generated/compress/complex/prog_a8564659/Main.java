import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry entry = new JarArchiveEntry("example.jar");
        
        byte[] extraData = new byte[]{1, 2, 3, 4};
        /* write */ entry.setExtra(extraData);
        
        // Unrelated code to make the program more complex
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");

        HashMap<String, Integer> stringLengths = new HashMap<>();
        for (String str : stringList) {
            stringLengths.put(str, str.length());
        }

        // Manipulating the string list
        for (String str : stringList) {
            System.out.println("String: " + str + ", Length: " + stringLengths.get(str));
        }

        // More unrelated operations
        int sum = 0;
        for (int i = 0; i < extraData.length; i++) {
            sum += extraData[i];
        }
        System.out.println("Sum of extraData: " + sum);

        // Even more unrelated operations
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 10);
        }

        for (int number : numberList) {
            System.out.println("Number: " + number);
        }

        // Finally reading the extra data
        /* read */ byte[] readData = entry.getExtra();
        
        System.out.print("Read Data: ");
        for (byte b : readData) {
            System.out.print(b + " ");
        }
    }
}