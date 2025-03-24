import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        int index = 0;
        int temp = 5 * 5 - 10; 
        if (temp == 15) {
            list.add(40);
        } else {
            list.remove((Integer)20);
            list.add(50);
            list.add(60);
            temp = list.size();
        }
        int compValue = (int)Math.pow(2, 3) + 7;
        if (compValue > 10) {
            index = 1;
        } else {
            index = 2;
        }
        /* write */ list.add(index, 99);
        int unrelatedValue = list.get(3); 
        list.add(70);
        list.remove((Integer)30);
        /* read */ int ret = list.get(1);
        System.out.println("Returned value: " + ret);
    }
}
