import java.util.concurrent.CopyOnWriteArrayList;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(0);
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(12);
        int index = 2;
        int misleadingIndex = 1;
        int falseSign = misleadingIndex * 5 - 3;
        for (int i = 0; i < list.size(); i++) {
            if (i == falseSign) {
                list.add(i * 2);
            }
        }
        if ((index + list.size()) % 3 == 0) {
            list.add(15);
        }
        int computation = falseSign * index;
        list.add(18);
        if (computation % 2 == 1) {
            /* write */ list.set(index, 999);
        } else {
            list.set(index + 1, 888);
        }
        if (list.contains(999)) {
            list.remove((Integer) 15);
        }
        list.addAll(list);
        list.clear();
        list.add(21);
        list.add(22);
        list.add(23);
        /* read */ int ret = list.get(0);
        System.out.println("Read value: " + ret);
    }
}