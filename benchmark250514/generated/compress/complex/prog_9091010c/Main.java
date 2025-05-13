import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        ArrayList<String> fileNames = new ArrayList<>();
        HashMap<String, Long> fileTimes = new HashMap<>();

        // Adding some file names to the list
        fileNames.add("example.txt");
        fileNames.add("document.pdf");
        fileNames.add("image.png");

        // Processing each file
        for (String fileName : fileNames) {
            ZipArchiveEntry entry = new ZipArchiveEntry(fileName);
            long currentTime = System.currentTimeMillis();
            entry.setTime(currentTime); // Set current time
            fileTimes.put(fileName, entry.getTime());
        }

        /* write */ zipEntry.setTime(1622505600000L); // Set time to a specific timestamp

        // Additional processing
        for (String fileName : fileNames) {
            if (fileTimes.containsKey(fileName)) {
                System.out.println("File: " + fileName + ", Time: " + fileTimes.get(fileName));
            }
        }

        // Unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // More unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 5);
        }
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        /* read */ long time = zipEntry.getTime();
        System.out.println("Time for example.txt: " + time);
    }
}