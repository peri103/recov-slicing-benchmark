import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Initialize a TarArchiveEntry object
        TarArchiveEntry entry = new TarArchiveEntry("dummy");

        // Use the write method to set the size
        /* write */ entry.setSize(1024);

        // Use the read method to get the size
        /* read */ long size = entry.getSize();

        // Print the size to verify that the read value is the same as the written value
        System.out.println(size);
    }
}