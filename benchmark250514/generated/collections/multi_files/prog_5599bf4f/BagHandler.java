import org.apache.commons.collections4.bag.HashBag;

public class BagHandler {
    private HashBag<String> bag = new HashBag<>();

    public void addItem(String item) {
        /* write */ bag.add(item);
    }

    public int getItemCount(String item) {
        return bag.getCount(item);
    }
}
