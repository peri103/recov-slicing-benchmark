import org.apache.commons.collections4.list.TreeList;

public class Main {
    public static void main(String[] args) {
        TreeList<Integer> list = new TreeList<>();
        /* write */ list.add(42);
        /* read */ int value = list.get(0);
        System.out.println(value);
    }
}