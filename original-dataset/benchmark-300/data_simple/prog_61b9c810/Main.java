import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        /* write */ set.add("testValue");
        /* read */ boolean containsValue = set.contains("testValue");
        System.out.println(containsValue);
    }
}