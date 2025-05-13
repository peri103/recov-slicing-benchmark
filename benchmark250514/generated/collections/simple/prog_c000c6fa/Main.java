import org.apache.commons.collections4.bag.TreeBag;

public class Main {
    public static void main(String[] args) {
        TreeBag<Integer> bag = new TreeBag<>();
        /* write */ bag.add(5);
        /* read */ int count = bag.getCount(5);
        System.out.println(count);
    }
}