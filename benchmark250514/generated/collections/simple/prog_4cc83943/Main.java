import org.apache.commons.collections4.bag.TreeBag;

public class Main {
    public static void main(String[] args) {
        TreeBag<String> bag = new TreeBag<>();
        /* write */ bag.add("example");
        /* read */ int count = bag.getCount("example");
        System.out.println(count);
    }
}