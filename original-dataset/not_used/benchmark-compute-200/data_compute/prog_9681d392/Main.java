import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        int magicNumber = 42;
        int complicatedCalculation = (magicNumber * 3 - 6) / 3;
        int index = (complicatedCalculation % 4 + list.size() + 7 * 2) % 4;
        list.remove(0);
        if (index != 0) {
            list.add(1, 50);
        } else {
            list.add(1, 60);
        }
        list.removeLast();
        /* write */ list.add(1, 99);
        list.removeFirst();
        list.addLast(80);
        list.pollFirst();
        if (list.getFirst() % 2 == 0) {
            list.addLast(5);
        } else {
            list.addLast(6);
        }
        /* other operations */
        /* read */ int ret = list.get(1);
        System.out.println("Read value: " + ret);
    }
}