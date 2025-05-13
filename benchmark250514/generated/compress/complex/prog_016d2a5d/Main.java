import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        ArrayList<String> fileNames = new ArrayList<>();
        HashMap<String, Integer> fileModes = new HashMap<>();

        fileNames.add("example.txt");
        fileNames.add("sample.txt");
        fileNames.add("test.txt");

        fileModes.put("sample.txt", 0755);
        fileModes.put("test.txt", 0700);

        /* write */ entry.setMode(0644);

        for (String fileName : fileNames) {
            System.out.println("Processing file: " + fileName);
            if (fileModes.containsKey(fileName)) {
                System.out.println("Mode for " + fileName + ": " + fileModes.get(fileName));
            }
        }

        /* read */ int mode = entry.getMode();
        System.out.println("Mode for example.txt: " + mode);

        ArrayList<TarArchiveEntry> entries = new ArrayList<>();
        entries.add(entry);
        entries.add(new TarArchiveEntry("sample.txt"));
        entries.add(new TarArchiveEntry("test.txt"));

        for (TarArchiveEntry tarEntry : entries) {
            System.out.println("Entry name: " + tarEntry.getName());
        }
    }
}