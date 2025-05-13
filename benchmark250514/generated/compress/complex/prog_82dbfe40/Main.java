import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        Date modTime = new Date();
        
        ArrayList<Date> dateList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            dateList.add(new Date(modTime.getTime() + i * 1000));
        }
        
        /* write */ entry.setModTime(modTime);
        
        TarArchiveEntry anotherEntry = new TarArchiveEntry("another_example.txt");
        anotherEntry.setModTime(dateList.get(2));
        
        Date retrievedDate = anotherEntry.getModTime();
        System.out.println("Another Entry Modification Time: " + retrievedDate);

        for (Date date : dateList) {
            System.out.println("Date in list: " + date);
        }
        
        /* read */ Date readModTime = entry.getModTime();
        System.out.println("Modification Time: " + readModTime);

        for (int i = 0; i < dateList.size(); i++) {
            if (dateList.get(i).equals(readModTime)) {
                System.out.println("Found matching modification time in list at index: " + i);
            }
        }
    }
}