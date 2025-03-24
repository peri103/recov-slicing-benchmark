import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        /* write */ set.add("Hello");
        /* read */ boolean containsValue = set.contains("Hello");
        System.out.println(containsValue);
    }
}