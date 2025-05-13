import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        ArrayList<Date> dateList = new ArrayList<>();
        HashMap<String, Date> dateMap = new HashMap<>();

        Date modificationTime = new Date();
        /* write */ gzipParams.setModificationTime(modificationTime);

        // Adding dates to the list
        for (int i = 0; i < 5; i++) {
            dateList.add(new Date(System.currentTimeMillis() + i * 1000));
        }

        // Populating the HashMap with some dates
        for (int i = 0; i < dateList.size(); i++) {
            dateMap.put("Date" + i, dateList.get(i));
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 integers: " + sum);

        // More unrelated calculations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 integers: " + product);

        // Access and print the modification time from GzipParameters
        /* read */ Date readModificationTime = gzipParams.getModificationTime();
        System.out.println("Modification Time: " + readModificationTime);

        // Print all dates in the list
        for (Date date : dateList) {
            System.out.println("Date from list: " + date);
        }

        // Print all entries in the map
        for (String key : dateMap.keySet()) {
            System.out.println(key + ": " + dateMap.get(key));
        }
    }
}