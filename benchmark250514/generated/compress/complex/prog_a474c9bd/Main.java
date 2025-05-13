import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a ZipArchiveEntry and set its Unix mode
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        /* write */ zipEntry.setUnixMode(644);

        // Create a HashMap to store file names and their permissions
        HashMap<String, Integer> filePermissions = new HashMap<>();
        filePermissions.put(zipEntry.getName(), zipEntry.getUnixMode());

        // Add more entries to the HashMap
        filePermissions.put("anotherFile.txt", 755);
        filePermissions.put("readme.md", 644);

        // Use an ArrayList to store file names
        List<String> fileList = new ArrayList<>();
        fileList.add("example.txt");
        fileList.add("anotherFile.txt");
        fileList.add("readme.md");

        // Iterate over the fileList and print their permissions from the HashMap
        for (String fileName : fileList) {
            if (filePermissions.containsKey(fileName)) {
                System.out.println("File: " + fileName + ", Permission: " + filePermissions.get(fileName));
            }
        }

        // Perform some complex operations with the list
        for (int i = 0; i < fileList.size(); i++) {
            String file = fileList.get(i);
            if (file.endsWith(".txt")) {
                System.out.println("Processing text file: " + file);
            }
        }

        // Retrieve the Unix mode of the original ZipArchiveEntry
        /* read */ int unixMode = zipEntry.getUnixMode();
        System.out.println("Unix Mode of example.txt: " + unixMode);

        // Additional logic to modify and print permissions
        filePermissions.replace("example.txt", 777);
        System.out.println("Updated Permission for example.txt: " + filePermissions.get("example.txt"));
    }
}