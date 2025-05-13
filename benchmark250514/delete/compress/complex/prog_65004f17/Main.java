import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        
        // Unrelated complex code
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");
        
        HashMap<String, Integer> nameLengthMap = new HashMap<>();
        for (String name : namesList) {
            nameLengthMap.put(name, name.length());
        }
        
        int totalLength = 0;
        for (Integer length : nameLengthMap.values()) {
            totalLength += length;
        }
        
        System.out.println("Total length of names: " + totalLength);
        
        /* write */ entry.setName("exampleName");
        
        // More unrelated code
        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbersList.add(i * i);
        }
        
        int sumOfSquares = 0;
        for (int number : numbersList) {
            sumOfSquares += number;
        }
        
        System.out.println("Sum of squares: " + sumOfSquares);
        
        /* read */ String name = entry.getName();
        System.out.println("DumpArchiveEntry name: " + name);
        
        // Further unrelated code
        HashMap<String, String> nameToUpperMap = new HashMap<>();
        for (String name : namesList) {
            nameToUpperMap.put(name, name.toUpperCase());
        }
        
        for (String key : nameToUpperMap.keySet()) {
            System.out.println(key + " -> " + nameToUpperMap.get(key));
        }
    }
}