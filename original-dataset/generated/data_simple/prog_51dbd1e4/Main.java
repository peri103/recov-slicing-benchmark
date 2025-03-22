import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        /* write */ set.add(1);
        /* read */ boolean containsValue = set.contains(1);
        System.out.println(containsValue);
    }
}