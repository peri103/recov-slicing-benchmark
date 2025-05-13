import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry();
        ArrayList<String> namesList = new ArrayList<>();
        HashMap<String, Integer> nameLengths = new HashMap<>();
        
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");
        
        for (String name : namesList) {
            nameLengths.put(name, name.length());
        }
        
        int totalLength = 0;
        for (Integer length : nameLengths.values()) {
            totalLength += length;
        }
        
        /* write */ entry.setSize(totalLength);
        
        for (String name : namesList) {
            System.out.println("Name: " + name + ", Length: " + nameLengths.get(name));
        }
        
        /* read */ long size = entry.getSize();
        System.out.println("Total size: " + size);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum of numbers: " + sum);
        
        if (sum > size) {
            System.out.println("Sum is greater than the total size.");
        } else {
            System.out.println("Sum is less than or equal to the total size.");
        }
    }
}