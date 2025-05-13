import org.apache.commons.collections4.bag.TreeBag;

public class Main {
    public static void main(String[] args) {
        TreeBag<String> bag = new TreeBag<>();
        /* write */ bag.add("apple");
        /* read */ int count = bag.getCount("apple");
        System.out.println("Count of 'apple': " + count);
    }
}