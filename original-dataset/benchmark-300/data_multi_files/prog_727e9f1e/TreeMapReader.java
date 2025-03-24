import java.util.TreeMap;

public class TreeMapReader {
    private TreeMap<Integer, String> map;

    public TreeMapReader(TreeMap<Integer, String> map) {
        this.map = map;
    }

    public String readValue(int key) {
        /* read */ return map.get(key);
    }
}
