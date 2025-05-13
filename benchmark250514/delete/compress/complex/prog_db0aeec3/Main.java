import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 100);
        }
        
        /* write */ entry.setCompressedSize(1024);
        
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        int average = sum / numbers.size();
        System.out.println("Average of numbers: " + average);
        
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        
        for (String str : strings) {
            System.out.println("String: " + str);
        }
        
        /* read */ long compressedSize = entry.getCompressedSize();
        System.out.println("Compressed Size: " + compressedSize);
        
        int maxNumber = numbers.stream().max(Integer::compare).orElse(0);
        System.out.println("Max number: " + maxNumber);
    }
}