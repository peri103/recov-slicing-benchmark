import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.zip");
        /* write */ zipEntry.setCompressedSize(1024);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("data", 42);
        map.put("value", 100);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 10);
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);

        int mapValue = map.get("value");
        System.out.println("Map value: " + mapValue);

        /* read */ long compressedSize = zipEntry.getCompressedSize();
        System.out.println(compressedSize);

        int product = 1;
        for (int num : list) {
            product *= num + 1;
        }
        System.out.println("Product of list elements plus one: " + product);

        map.put("result", sum + product);
        System.out.println("Result stored in map: " + map.get("result"));
    }
}