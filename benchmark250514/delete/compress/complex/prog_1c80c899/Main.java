import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("");
        ArrayList<String> fileList = new ArrayList<>();
        HashMap<String, String> fileDetails = new HashMap<>();

        // Add some unrelated operations
        fileList.add("file1.txt");
        fileList.add("file2.txt");
        fileList.add("example.jar");
        
        fileDetails.put("file1.txt", "Text File");
        fileDetails.put("file2.txt", "Text File");
        
        // Simulate some operations on fileList
        for (String file : fileList) {
            if (file.endsWith(".jar")) {
                /* write */ jarEntry.setName(file);
            }
        }
        
        // More unrelated operations
        for (String file : fileList) {
            if (!fileDetails.containsKey(file)) {
                fileDetails.put(file, "Unknown File");
            }
        }
        
        // Accessing the name of the jar entry
        /* read */ String name = jarEntry.getName();
        System.out.println("Jar Entry Name: " + name);

        // Print details of all files
        for (String file : fileDetails.keySet()) {
            System.out.println("File: " + file + ", Type: " + fileDetails.get(file));
        }
    }
}