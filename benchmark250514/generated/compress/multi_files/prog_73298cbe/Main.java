import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipEntryManager manager = new ZipEntryManager();
        ZipEntryReader reader = new ZipEntryReader(manager);

        ZipArchiveEntry entry1 = new ZipArchiveEntry("example.txt");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("another_example.txt");

        manager.addEntry(entry1);
        manager.addEntry(entry2);

        manager.setEntryMethod("example.txt", ZipArchiveEntry.DEFLATED);

        int method = reader.getEntryMethod("example.txt");
        System.out.println("Method of example.txt: " + method);
    }
}