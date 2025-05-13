import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a TarArchiveEntry
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        
        // Initialize a HashMap to store user ID and names
        HashMap<Integer, String> userMap = new HashMap<>();
        userMap.put(1001, "Alice");
        userMap.put(1002, "Bob");
        userMap.put(1003, "Charlie");

        // Initialize an ArrayList to store some data
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add("Data1");
        dataList.add("Data2");
        dataList.add("Data3");

        // Set user ID using the TarArchiveEntry method
        /* write */ entry.setUserId(1001);

        // Perform some unrelated operations
        for (String data : dataList) {
            System.out.println("Processing: " + data);
        }

        // Retrieve the user ID from the TarArchiveEntry
        /* read */ int userId = entry.getUserId();

        // Use the retrieved user ID to get the user's name from the HashMap
        String userName = userMap.get(userId);
        System.out.println("User ID: " + userId + ", User Name: " + userName);

        // More unrelated operations
        for (int i = 0; i < 3; i++) {
            int calculation = i * 2 + 5;
            System.out.println("Calculation result: " + calculation);
        }
    }
}