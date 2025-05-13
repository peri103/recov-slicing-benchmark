import org.apache.commons.collections4.list.NodeCachingLinkedList;

public class Main {
    public static void main(String[] args) {
        NodeCachingLinkedList<Integer> list = new NodeCachingLinkedList<>();
        /* write */ list.add(42);
        /* read */ int value = list.get(0);
        System.out.println(value);
    }
}