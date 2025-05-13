import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry tarEntry = new TarArchiveEntry("example.txt");
        /* write */ tarEntry.setFileType(TarArchiveEntry.FILE_TYPE_NORMAL);

        // Adding more complexity
        Map<String, String> exampleMap = new HashMap<>();
        exampleMap.put("key1", "value1");
        exampleMap.put("key2", "value2");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        for (String key : exampleMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + exampleMap.get(key));
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // More unrelated operations
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append("World!");
        System.out.println(sb.toString());

        // Reading the file type
        /* read */ int fileType = tarEntry.getFileType();
        System.out.println("File Type: " + fileType);

        // Further operations to increase complexity
        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        for (String str : strings) {
            System.out.println("String: " + str);
        }
    }
}