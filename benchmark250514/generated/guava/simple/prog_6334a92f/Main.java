import com.google.common.collect.SortedSetMultimap;
import com.google.common.collect.TreeMultimap;
import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
        SortedSetMultimap<String, Integer> multimap = TreeMultimap.create();
        
        /* write */ multimap.put("key1", 100);
        
        /* read */ SortedSet<Integer> values = multimap.get("key1");
        System.out.println(values);
    }
}