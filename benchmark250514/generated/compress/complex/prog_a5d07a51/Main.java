import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        
        ArrayList<String> fileList = new ArrayList<>();
        fileList.add("example.txt");
        fileList.add("test.txt");
        fileList.add("data.txt");

        HashMap<String, Integer> fileMethods = new HashMap<>();
        
        /* write */ zipEntry.setMethod(ZipArchiveEntry.DEFLATED);
        
        for (String file : fileList) {
            ZipArchiveEntry entry = new ZipArchiveEntry(file);
            entry.setMethod(ZipArchiveEntry.STORED);
            fileMethods.put(file, entry.getMethod());
        }
        
        int method = zipEntry.getMethod();
        
        /* read */ System.out.println("Compression method for example.txt: " + method);
        
        for (String file : fileList) {
            System.out.println("Compression method for " + file + ": " + fileMethods.get(file));
        }
        
        int sumMethods = 0;
        for (Integer m : fileMethods.values()) {
            sumMethods += m;
        }
        
        System.out.println("Sum of all methods: " + sumMethods);
    }
}