import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        /* write */ zipEntry.setCompressedSize(1024);

        ArrayList<String> fileNames = new ArrayList<>();
        fileNames.add("file1.txt");
        fileNames.add("file2.txt");
        fileNames.add("file3.txt");

        for (String fileName : fileNames) {
            ZipArchiveEntry entry = new ZipArchiveEntry(fileName);
            entry.setCompressedSize(2048);
            System.out.println("Processed: " + fileName + ", Compressed Size: " + entry.getCompressedSize());
        }

        // Some unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 integers: " + sum);

        /* read */ long compressedSize = zipEntry.getCompressedSize();
        System.out.println("Original Compressed Size: " + compressedSize);

        // More unrelated code
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 100);
        }
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}