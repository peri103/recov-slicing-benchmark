import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("");
        ArrayList<String> fileList = new ArrayList<>();
        HashMap<String, Integer> fileMap = new HashMap<>();
        
        fileList.add("file1.txt");
        fileList.add("file2.txt");
        
        for (String file : fileList) {
            fileMap.put(file, file.length());
        }
        
        /* write */ entry.setName("example.txt");
        
        int totalLength = 0;
        for (String file : fileList) {
            totalLength += fileMap.get(file);
        }
        
        System.out.println("Total length of filenames: " + totalLength);
        
        ArrayList<TarArchiveEntry> entries = new ArrayList<>();
        entries.add(entry);
        
        for (TarArchiveEntry tarEntry : entries) {
            System.out.println("Processing entry: " + tarEntry.getName());
        }
        
        /* read */ String name = entry.getName();
        System.out.println("Entry name: " + name);
        
        ArrayList<String> processedFiles = new ArrayList<>();
        for (String file : fileList) {
            processedFiles.add(file.toUpperCase());
        }
        
        for (String processedFile : processedFiles) {
            System.out.println("Processed file: " + processedFile);
        }
    }
}