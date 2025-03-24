import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        /* write */ set.add(10);
        /* read */ boolean containsValue = set.contains(10);
        System.out.println(containsValue);
    }
}