import org.apache.commons.collections4.list.NodeCachingLinkedList;

public class Main {
    public static void main(String[] args) {
        NodeCachingLinkedList list = new NodeCachingLinkedList();
        /* write */ list.add(42);
        /* read */ int value = (Integer) list.get(0);
        System.out.println(value);
    }
}