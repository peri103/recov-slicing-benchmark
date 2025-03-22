import java.util.HashSet;

public class NumberSet {
    private HashSet<Integer> set = new HashSet<>();

    public void addNumber(int number) {
        /* write */ set.add(number);
    }

    public boolean containsNumber(int number) {
        return set.contains(number);
    }
}
