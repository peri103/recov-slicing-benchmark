import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        int a = (int) (Math.random() * 100);
        int b = a % 3;
        /* write */ if (b < 2) {
            list.add(20); 
        } else {
            list.add(25);
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 1); 
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 10) {
                sum += list.get(i);
            }
        }
        list.add(100);
        list.add(200);
        int indexToCheck = sum % 2 == 0 ? 2 : 3;
        /* read */ int ret = list.get(2); 
        System.out.println("Value read: " + ret);
    }
}