import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        /* write */ set.add(42);
        /* read */ boolean containsValue = set.contains(42);
        System.out.println(containsValue);
    }
}