import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry entry = new ZipArchiveEntry("testEntry");
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};

        ArrayList<String> stringList = new ArrayList<>();
        HashMap<Integer, String> indexToStringMap = new HashMap<>();
        StringBuilder complexString = new StringBuilder();

        stringList.add("Hello");
        stringList.add("World");
        stringList.add("This");
        stringList.add("Is");
        stringList.add("Java");

        for (int i = 0; i < stringList.size(); i++) {
            indexToStringMap.put(i, stringList.get(i));
        }

        for (String str : stringList) {
            complexString.append(str).append(" ");
        }

        /* write */ entry.setExtra(extraData);

        int sumOfLengths = 0;
        for (int i = 0; i < stringList.size(); i++) {
            sumOfLengths += stringList.get(i).length();
        }

        String concatenatedString = complexString.toString();
        System.out.println("Concatenated String: " + concatenatedString);
        System.out.println("Sum of Lengths: " + sumOfLengths);

        if (indexToStringMap.containsKey(2)) {
            System.out.println("Index 2 contains: " + indexToStringMap.get(2));
        }

        /* read */ byte[] readData = entry.getExtra();

        System.out.print("Read Extra Data: ");
        for (byte b : readData) {
            System.out.print(b + " ");
        }
    }
}