import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("example.txt");
        ArrayList<CpioArchiveEntry> entries = new ArrayList<>();
        
        entries.add(entry);
        CpioArchiveEntry anotherEntry = new CpioArchiveEntry("another.txt");
        anotherEntry.setMode(0644);
        entries.add(anotherEntry);

        for (CpioArchiveEntry e : entries) {
            System.out.println("Initial mode: " + e.getMode());
        }

        /* write */ entry.setMode(0755);

        int totalModeSum = 0;
        for (CpioArchiveEntry e : entries) {
            totalModeSum += e.getMode();
        }

        int averageMode = totalModeSum / entries.size();
        System.out.println("Average mode before read: " + averageMode);

        /* read */ int mode = entry.getMode();
        System.out.println("Read mode for example.txt: " + mode);

        totalModeSum = 0;
        for (CpioArchiveEntry e : entries) {
            totalModeSum += e.getMode();
        }

        averageMode = totalModeSum / entries.size();
        System.out.println("Average mode after read: " + averageMode);
    }
}