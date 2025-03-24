import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 10);
        }
        list.addFirst(99);
        list.addLast(100);
        list.remove(0);
        int rand1 = (int) (Math.random() * 100);
        int x = 5000;
        int k = rand1 % 5 + 3;
        list.add(2, 42);
        list.add(3, 55);
        list.set(4, 44);
        list.remove(new Integer(55));
        if (k % 2 == 0) {
            list.add(5, 88);
        } else {
            list.add(77);
        }
        int criticalIndex = 6;
        /* write */ list.add(criticalIndex, 333);
        list.remove(6);
        list.add(criticalIndex - 1, 222);
        /* read */ int ret = list.get(criticalIndex);
        System.out.println("Retrieved value: " + ret);
    }
}
