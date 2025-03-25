import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10); 
        set.add(20); 
        int x = 100;
        int y = 200;
        set.add(x + y);
        set.add(x - y);
        int threshold = 150;
        if (((x + y) % 2 == 0) && smartCheck(threshold)) {
            /* write */ set.add(30);
        } else {
            set.add(-30);
        }
        set.add(y / 10);
        set.add(x * 2);
        int sum = 0;
        for (Integer element : set) {
            sum += element;
        }
        if (sum > 0) {
            set.add(41);
        }
        boolean found = false;
        for (int value : set) {
            if (value - threshold > 0) {
                found = true;
            }
        }
        /* read */ Integer result = found ? 30 : -1;
        System.out.println("Read Value: " + result);
    }
    private static boolean smartCheck(int num) {
        return num + 50 > 100 && num - 30 < 100;
    }
}
