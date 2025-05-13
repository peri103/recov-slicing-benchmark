import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipExtraField;
import org.apache.commons.compress.archivers.zip.UnixStat;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry entry = new ZipArchiveEntry("example.txt");
        ArrayList<ZipArchiveEntry> entries = new ArrayList<>();

        // Setting some additional properties
        entry.setSize(1024);
        entry.setUnixMode(UnixStat.FILE_FLAG | UnixStat.DEFAULT_FILE_PERM);

        // Add entry to a list
        entries.add(entry);

        // Create another ZipArchiveEntry and add to the list
        ZipArchiveEntry anotherEntry = new ZipArchiveEntry("another_example.txt");
        anotherEntry.setSize(2048);
        anotherEntry.setUnixMode(UnixStat.FILE_FLAG | UnixStat.DEFAULT_FILE_PERM);
        entries.add(anotherEntry);

        // Process entries
        for (ZipArchiveEntry e : entries) {
            System.out.println("Entry: " + e.getName() + ", Size: " + e.getSize());
        }

        // Set method for the initial entry
        /* write */ entry.setMethod(ZipArchiveEntry.DEFLATED);

        // Add some extra fields
        ZipExtraField[] extraFields = entry.getExtraFields();
        for (ZipExtraField field : extraFields) {
            System.out.println("Extra field: " + field.toString());
        }

        // Read the method used for compression
        /* read */ int method = entry.getMethod();
        System.out.println("Method used for compression: " + method);

        // More complex operations
        int totalSize = 0;
        for (ZipArchiveEntry e : entries) {
            totalSize += e.getSize();
        }
        System.out.println("Total size of all entries: " + totalSize);
    }
}