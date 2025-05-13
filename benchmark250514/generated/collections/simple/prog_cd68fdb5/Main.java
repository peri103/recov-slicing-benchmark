import org.apache.commons.collections4.list.NodeCachingLinkedList;

public class Main {
    public static void main(String[] args) {
        NodeCachingLinkedList list = new NodeCachingLinkedList();
        /* write */ list.add("Hello, World!");
        /* read */ String value = (String) list.get(0);
        System.out.println(value);
    }
}