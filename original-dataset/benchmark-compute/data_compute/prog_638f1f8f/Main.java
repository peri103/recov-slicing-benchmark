import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        for (int i = 0; i < 5; i++) {
            set.add(i);
        }
        boolean condition = (Math.random() > 0.5);
        int temp = 0;
        if (condition) {
            temp = 5;
        } else {
            temp = 10;
        }
        set.add(30);
        if (temp + 10 > 15) {
            set.add(25);
        }
        int sum = 0;
        for (Integer num : set) {
            sum += num;
        }
        set.add(40);
        int index = 0;
        /* write */ Integer[] array = set.toArray(new Integer[0]);
        /* read */ int ret = array[2];
        System.out.println("Read value: " + ret);
    }
}