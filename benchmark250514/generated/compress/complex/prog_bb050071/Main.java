import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        Date currentDate = new Date();
        
        // Unrelated complex code
        ArrayList<Integer> numberList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 5);
            map.put("Key" + i, i * 10);
        }
        
        for (Integer num : numberList) {
            System.out.println("Number: " + num);
        }
        
        for (String key : map.keySet()) {
            System.out.println("Map Entry: " + key + " -> " + map.get(key));
        }
        
        /* write */ entry.setModTime(currentDate);
        
        // More complex code
        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(new Date(1633036800000L)); // Oct 1, 2021
        dateList.add(new Date(1635724800000L)); // Nov 1, 2021
        dateList.add(currentDate);
        
        for (Date date : dateList) {
            System.out.println("Stored Date: " + date);
        }
        
        // Some calculations
        int sum = 0;
        for (int i = 0; i < numberList.size(); i++) {
            sum += numberList.get(i);
        }
        System.out.println("Sum of numbers: " + sum);

        /* read */ Date modTime = entry.getModTime();
        System.out.println("Modification Time: " + modTime);
        
        // Final loop to print all dates
        for (Date date : dateList) {
            System.out.println("Final Date: " + date);
        }
    }
}