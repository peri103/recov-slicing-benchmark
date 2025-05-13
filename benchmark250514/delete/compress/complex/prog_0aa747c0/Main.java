import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();

        // Initializing extra data
        byte[] extraData = {1, 2, 3, 4, 5};
        /* write */ gzipParameters.setExtra(extraData);

        // Additional unrelated code to make the program more complex
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);

        for (String s : stringList) {
            System.out.println(s);
        }

        Integer mapValue = map.get("One");
        System.out.println("Map value for 'One': " + mapValue);

        // Another unrelated operation
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Read operation, far apart from the write operation
        /* read */ byte[] readExtraData = gzipParameters.getExtra();
        System.out.print("Read extra data: ");
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}