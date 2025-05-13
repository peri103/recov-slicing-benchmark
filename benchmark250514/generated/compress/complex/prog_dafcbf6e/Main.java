import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        ArrayList<String> fileNames = new ArrayList<>();
        fileNames.add("file1.txt");
        fileNames.add("file2.txt");
        fileNames.add("file3.txt");

        for (String fileName : fileNames) {
            ZipArchiveEntry entry = new ZipArchiveEntry(fileName);
            entry.setCrc(fileName.hashCode());
            System.out.println("CRC for " + fileName + ": " + entry.getCrc());
        }

        /* write */ zipEntry.setCrc(123456789L);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("Total sum of numbers from 1 to 10: " + total);

        /* read */ long crcValue = zipEntry.getCrc();
        System.out.println("Original CRC value: " + crcValue);
    }
}