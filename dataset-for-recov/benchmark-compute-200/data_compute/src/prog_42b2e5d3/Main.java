import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(42);
        list.add(96);
        list.add(33);
        int unrelatedCalculation = (list.getFirst() + list.size()) * 3;
        boolean flag = unrelatedCalculation % 2 == 0;
        int conditionValue = flag ? 5 : 7;
        if (conditionValue > 4) {
            /* write */ list.add(11);
        } else {
            list.add(22);
        }
        list.addFirst(19);
        list.addLast(27);
        list.removeLast();
        list.add(3, 99);
        int misleadingIndex = unrelatedCalculation % list.size();
        list.set(misleadingIndex, 100);
        list.add(misleadingIndex, 101);
        /* read */ int ret = list.get(conditionValue - 4);
    }
}
