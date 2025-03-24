import java.util.concurrent.CopyOnWriteArrayList;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        int unrelatedCalculation = 9999;
        list.add(unrelatedCalculation);
        for (int i = 0; i < 5; i++) {
            list.add(i * 100);
        }
        unrelatedCalculation += 12345;
        if (unrelatedCalculation % 2 == 0) {
            /* write */list.add(4242);
        } else {
            list.add(2424);
        }
        list.add(list.size(), 12345);
        unrelatedCalculation *= 2;
        if (list.contains(4242)) {
            unrelatedCalculation -= 5000;
        }
        /* read */int ret = list.get(5);
        System.out.println("The value at the read point is: " + ret);
    }
}