import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        Date currentDate = new Date();
        
        /* write */ entry.setModTime(currentDate);

        // Additional code to increase complexity
        ArrayList<Date> dateList = new ArrayList<>();
        HashMap<String, TarArchiveEntry> entryMap = new HashMap<>();
        
        for (int i = 0; i < 3; i++) {
            dateList.add(new Date(currentDate.getTime() + i * 1000));
        }
        
        entryMap.put("entry1", entry);
        
        TarArchiveEntry anotherEntry = new TarArchiveEntry("another.txt");
        anotherEntry.setModTime(dateList.get(0));
        entryMap.put("entry2", anotherEntry);
        
        for (String key : entryMap.keySet()) {
            System.out.println("Entry: " + key + ", Mod Time: " + entryMap.get(key).getModTime());
        }
        
        // Some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Accessing the original entry's modification time
        /* read */ Date modTime = entry.getModTime();
        
        System.out.println("Original Entry Mod Time: " + modTime);
        
        // Using the dates from dateList in some operations
        for (Date date : dateList) {
            System.out.println("Date from list: " + date);
        }
    }
}