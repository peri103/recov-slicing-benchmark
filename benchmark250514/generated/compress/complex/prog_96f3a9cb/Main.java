import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("test.zip");
        long currentTime = System.currentTimeMillis();

        ArrayList<String> fileList = new ArrayList<>();
        fileList.add("file1.txt");
        fileList.add("file2.txt");
        fileList.add("file3.txt");

        HashMap<String, Long> fileTimeMap = new HashMap<>();
        for (String fileName : fileList) {
            fileTimeMap.put(fileName, System.currentTimeMillis());
        }

        /* write */ zipEntry.setTime(currentTime);

        for (String fileName : fileTimeMap.keySet()) {
            System.out.println("File: " + fileName + ", Time: " + fileTimeMap.get(fileName));
        }

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 99: " + sum);

        /* read */ long readTime = zipEntry.getTime();

        System.out.println("Time set: " + currentTime);
        System.out.println("Time read: " + readTime);

        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(i * 10);
        }

        for (Integer number : numberList) {
            System.out.println("Number: " + number);
        }

        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}