import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        byte[] extraData = {1, 2, 3, 4, 5};
        
        /* write */ zipEntry.setExtra(extraData);
        
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(i * 2);
        }
        
        int sum = 0;
        for (int number : numberList) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        int max = numberList.get(0);
        for (int number : numberList) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Max number: " + max);

        /* read */ byte[] readExtraData = zipEntry.getExtra();
        
        System.out.print("Extra data: ");
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
        System.out.println();

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Zip");
        stringList.add("Entry");

        for (String str : stringList) {
            System.out.println("String: " + str);
        }
    }
}