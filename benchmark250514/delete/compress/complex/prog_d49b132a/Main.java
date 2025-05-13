import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test");
        
        ArrayList<String> fileNames = new ArrayList<>();
        fileNames.add("file1.txt");
        fileNames.add("file2.txt");
        fileNames.add("file3.txt");
        
        for (String fileName : fileNames) {
            CpioArchiveEntry fileEntry = new CpioArchiveEntry(fileName);
            fileEntry.setMode(CpioConstants.C_ISREG);
            System.out.println("Created entry for: " + fileEntry.getName() + " with mode: " + fileEntry.getMode());
        }
        
        /* write */ entry.setMode(0644);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Processing item: " + i);
        }
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 100);
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        System.out.println("Sum of numbers: " + sum);
        
        /* read */ int mode = entry.getMode();
        System.out.println("Mode of entry: " + mode);
        
        ArrayList<Double> values = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            values.add(Math.random() * 100);
        }
        
        double average = 0;
        for (double value : values) {
            average += value;
        }
        average /= values.size();
        
        System.out.println("Average of random values: " + average);
    }
}