import org.apache.commons.collections4.bag.HashBag;

public class Main {
    public static void main(String[] args) {
        HashBag<String> bag = new HashBag<>();

        /* write */ bag.add("apple");

        /* read */ int count = bag.getCount("apple");
        
        System.out.println(count);
    }
}