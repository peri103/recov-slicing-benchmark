import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        int complexNumber = (int)((Math.random() * 1000) % 12);
        if (complexNumber % 2 == 0) {
            list.add(5);
        } else {
            list.add(15);
        }
        list.add(complexNumber);
        list.remove(new Integer(10));
        list.set(0, 50);
        int misleadingIndex = (complexNumber + 5) % 3;
        list.add(misleadingIndex, 40);
        boolean dummyCondition = list.contains(15);
        if (dummyCondition) {
            list.add(25);
        } else {
            list.add(35);
        }
        list.remove(1);
        list.add(2, 99);
        if (complexNumber % 3 == 0) {
            list.add(1, 45);
        } else {
            /* write */list.add(1, 55);
        }
        /* read */ int ret = list.get(2);
        System.out.println("The retrieved value is: " + ret);
    }
}
