import org.apache.commons.collections4.list.NodeCachingLinkedList;

public class NodeCachingLinkedListWrapper {
    private NodeCachingLinkedList<Integer> list = new NodeCachingLinkedList<>();

    public void addElement(int element) {
        /* write */ list.add(element);
    }

    public NodeCachingLinkedList<Integer> getList() {
        return list;
    }
}
