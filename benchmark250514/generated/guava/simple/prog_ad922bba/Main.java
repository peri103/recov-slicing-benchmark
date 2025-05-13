import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        /* write */ ImmutableCollection<String> collection = ImmutableList.of("apple", "banana", "cherry");
        /* read */ boolean containsBanana = collection.contains("banana");
        System.out.println(containsBanana);
    }
}