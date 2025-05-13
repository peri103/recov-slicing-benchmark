import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        /* write */ entry.setSize(1024);
        
        // Additional complex code
        ArrayList<String> fileList = new ArrayList<>();
        fileList.add("file1.txt");
        fileList.add("file2.txt");

        HashMap<String, Integer> fileSizes = new HashMap<>();
        fileSizes.put("file1.txt", 500);
        fileSizes.put("file2.txt", 1500);

        for (String file : fileList) {
            if (fileSizes.containsKey(file)) {
                System.out.println("Size of " + file + ": " + fileSizes.get(file));
            }
        }

        // Simulate some processing
        int totalSize = 0;
        for (Map.Entry<String, Integer> entrySet : fileSizes.entrySet()) {
            totalSize += entrySet.getValue();
        }
        System.out.println("Total size of files: " + totalSize);

        // More unrelated code
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // Back to the original read
        /* read */ long size = entry.getSize();
        System.out.println("CpioArchiveEntry size: " + size);

        // Some final operations
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
            System.out.println("Doubled number: " + numbers[i]);
        }
    }
}