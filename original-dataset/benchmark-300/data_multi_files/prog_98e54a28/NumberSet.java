import java.util.TreeSet;

public class NumberSet {
    private TreeSet<Integer> numbers = new TreeSet<>();

    public void addNumber(int number) {
        /* write */ numbers.add(number);
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
