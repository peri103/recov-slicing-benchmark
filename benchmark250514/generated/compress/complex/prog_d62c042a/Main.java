import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("initial");
        /* write */ entry.setName("newName");
        
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("zipEntry");
        zipEntry.setComment("This is a zip entry.");
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        
        for (String str : list) {
            System.out.println(str);
        }
        
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        
        String comment = zipEntry.getComment();
        System.out.println("Zip Entry Comment: " + comment);
        
        /* read */ String name = entry.getName();
        System.out.println(name);
        
        list.add("New Element");
        map.put("Three", 3);
        
        for (String str : list) {
            System.out.println(str);
        }
        
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}