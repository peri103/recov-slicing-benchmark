import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        long lastModifiedTime = System.currentTimeMillis();
        
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);
        
        /* write */ entry.setLastModified(lastModifiedTime);
        
        for (String str : stringList) {
            System.out.println("String from list: " + str);
        }
        
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of map values: " + sum);
        
        /* read */ long retrievedLastModifiedTime = entry.getLastModified();
        System.out.println(retrievedLastModifiedTime);
        
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 10);
        }
        
        for (int num : numberList) {
            System.out.println("Number from list: " + num);
        }
    }
}