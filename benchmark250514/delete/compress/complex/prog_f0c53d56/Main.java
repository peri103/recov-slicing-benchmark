import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 100);
        /* write */ entry.setExternalAttributes(12345);

        // Adding complexity with a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Key1", 1);
        map.put("Key2", 2);
        int mapValue = map.get("Key1");
        System.out.println("Map Value: " + mapValue);

        // Using a different API
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("zipExample.txt");
        zipEntry.setComment("This is a zip entry");
        String comment = zipEntry.getComment();
        System.out.println("Zip Entry Comment: " + comment);

        // Adding complexity with an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List Value: " + list.get(i));
        }

        // Additional logic with conditionals
        if (list.contains(20)) {
            System.out.println("List contains the value 20.");
        } else {
            System.out.println("List does not contain the value 20.");
        }

        /* read */ int externalAttributes = entry.getExternalAttributes();
        System.out.println("External Attributes: " + externalAttributes);
    }
}