import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        List<ZipArchiveEntry> zipEntries = new ArrayList<>();
        
        zipEntries.add(new ZipArchiveEntry("file1.txt"));
        zipEntries.add(new ZipArchiveEntry("file2.txt"));
        zipEntries.add(new ZipArchiveEntry("file3.txt"));

        for (ZipArchiveEntry entry : zipEntries) {
            entry.setMethod(ZipArchiveEntry.STORED);
        }
        
        /* write */ zipEntry.setMethod(ZipArchiveEntry.DEFLATED);

        int totalMethodSum = 0;
        for (ZipArchiveEntry entry : zipEntries) {
            totalMethodSum += entry.getMethod();
        }

        int method = zipEntry.getMethod();
        /* read */ System.out.println(method);

        totalMethodSum += method;

        System.out.println("Total method sum: " + totalMethodSum);

        for (int i = 0; i < zipEntries.size(); i++) {
            System.out.println("Method of zipEntries[" + i + "]: " + zipEntries.get(i).getMethod());
        }
    }
}