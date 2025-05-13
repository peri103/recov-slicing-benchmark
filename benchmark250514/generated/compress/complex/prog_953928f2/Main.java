import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.zip");
        
        /* write */ jarEntry.setSize(1024);
        
        // Additional code to manipulate ZipArchiveEntry
        zipEntry.setSize(2048);
        long zipSize = zipEntry.getSize();
        System.out.println("Zip entry size: " + zipSize);

        // Unrelated code to add complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // More unrelated operations
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max number: " + max);

        /* read */ long jarSize = jarEntry.getSize();
        System.out.println("Jar entry size: " + jarSize);
    }
}