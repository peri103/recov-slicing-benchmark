import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("dummy");
        /* write */ entry.setGroupId(1001);

        // Additional complex logic
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 10);
        map.put("key2", 20);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        int mapValue = map.get("key1") + map.get("key2");

        // More complex operations
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");

        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str).append(" ");
        }

        // Reading the group ID after other operations
        /* read */ long groupId = entry.getGroupId();

        System.out.println("GroupId: " + groupId);
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Sum of map values: " + mapValue);
        System.out.println("Concatenated String: " + sb.toString().trim());
    }
}