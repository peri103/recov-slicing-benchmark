import com.google.common.collect.TreeMultimap;

public class Main {
    public static void main(String[] args) {
        TreeMultimap<String, Integer> treeMultimap = TreeMultimap.create();
        /* write */ treeMultimap.put("key", 42);
        /* read */ Integer value = treeMultimap.get("key").first();
        System.out.println(value);
    }
}