import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        
        // Additional unrelated code to make the program more complex
        ArrayList<String> stringList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            stringList.add("String " + i);
        }

        // Another use of TarArchiveEntry without marking with /* write */ or /* read */
        TarArchiveEntry anotherEntry = new TarArchiveEntry("another.txt");
        anotherEntry.setLinkName("anotherLinkName");
        String anotherLinkName = anotherEntry.getLinkName();
        System.out.println(anotherLinkName);

        /* write */ entry.setLinkName("linkName");
        
        // More complex operations
        int sum = 0;
        for (String str : stringList) {
            sum += str.length();
        }
        System.out.println("Sum of string lengths: " + sum);

        /* read */ String linkName = entry.getLinkName();
        System.out.println(linkName);

        // Further operations
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(i * 2);
        }

        int product = 1;
        for (int num : intList) {
            product *= num;
        }
        System.out.println("Product of integers: " + product);
    }
}