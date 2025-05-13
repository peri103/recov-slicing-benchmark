import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TarEntryManager manager = new TarEntryManager("example.txt");
        DateHandler dateHandler = new DateHandler();

        Date currentDate = new Date();
        manager.setEntryModTime(currentDate);

        // Add some dates to the date list
        for (int i = 0; i < 3; i++) {
            dateHandler.addDate(new Date(currentDate.getTime() + i * 1000));
        }

        // Print the dates from the date list
        for (Date date : dateHandler.getDateList()) {
            System.out.println("Date from list: " + date);
        }

        // Accessing the original entry's modification time
        TarArchiveEntry entry = manager.getEntry();
        /* read */ Date modTime = entry.getModTime();
        
        System.out.println("Original Entry Mod Time: " + modTime);
    }
}