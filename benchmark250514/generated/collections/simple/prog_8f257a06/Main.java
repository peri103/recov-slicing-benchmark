import org.apache.commons.collections4.bag.TreeBag;

public class Main {
    public static void main(String[] args) {
        TreeBag<String> treeBag = new TreeBag<>();
        /* write */ treeBag.add("apple");
        /* read */ int count = treeBag.getCount("apple");
        System.out.println(count);
    }
}