import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 1000);
        ArrayList<String> fileList = new ArrayList<>();
        HashMap<String, String> metadata = new HashMap<>();

        fileList.add("file1.txt");
        fileList.add("file2.txt");
        fileList.add("file3.txt");

        metadata.put("file1.txt", "owner:admin");
        metadata.put("file2.txt", "owner:user");
        metadata.put("file3.txt", "owner:guest");

        /* write */ entry.setGroupName("developers");

        for (String file : fileList) {
            System.out.println("Processing: " + file);
            if (metadata.containsKey(file)) {
                System.out.println("Metadata: " + metadata.get(file));
            }
        }

        if (!fileList.isEmpty()) {
            String firstFile = fileList.get(0);
            System.out.println("First file in the list: " + firstFile);
        }

        String groupName = entry.getGroupName();
        /* read */ System.out.println("Group Name: " + groupName);

        // Additional operations to increase complexity
        for (int i = 0; i < 5; i++) {
            ArArchiveEntry tempEntry = new ArArchiveEntry("temp" + i + ".txt", 500 + i);
            tempEntry.setGroupName("group" + i);
            System.out.println("Temp Entry Group Name: " + tempEntry.getGroupName());
        }

        System.out.println("Program completed.");
    }
}