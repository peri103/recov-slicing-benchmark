import java.util.concurrent.ConcurrentSkipListSet;

public class NumberSet {
    private ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

    public void addNumber(int number) {
        /* write */ set.add(number);
    }

    public boolean containsNumber(int number) {
        return set.contains(number);
    }

    public void printSet() {
        for (Integer num : set) {
            System.out.println(num);
        }
    }
}
