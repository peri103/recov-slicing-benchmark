import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        int a = 103 * 42 + 7;
        int b = a * 31 - 103;
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(5, "Five");
        if ((b % 5) != 0) {
            treeMap.put(7, "Seven");
            /* write */ treeMap.put(4, "Four");
        } else {
            treeMap.put(8, "Eight");
            treeMap.put(6, "Six");
        }
        int u = b % 3;
        treeMap.remove(5);
        treeMap.put(9, "Nine");
        treeMap.put(u, "MysteryElement");

        /* read */ String ret = treeMap.get(4);
        System.out.println("Retrieved Value: " + ret);
    }
}