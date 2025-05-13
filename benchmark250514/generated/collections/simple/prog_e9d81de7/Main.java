import org.apache.commons.collections4.list.TreeList;

public class Main {
    public static void main(String[] args) {
        TreeList<Integer> treeList = new TreeList<>();
        /* write */ treeList.add(42);
        /* read */ int value = treeList.get(0);
        System.out.println(value);
    }
}