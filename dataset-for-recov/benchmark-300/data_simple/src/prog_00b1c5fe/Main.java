import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        /* write */ set.add("example");
        /* read */ boolean containsValue = set.contains("example");
        System.out.println(containsValue);
    }
}