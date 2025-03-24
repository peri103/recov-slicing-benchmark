import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        int flag = (int) (Math.random() * 2);
        for (int i = 5; i < 10; i++) {
            set.add(i * 10 + flag);
        }
        int unrelatedVar = set.size() * 3 + 7;
        if (unrelatedVar % 2 == 0) {
            set.add(50);
        }
        if (flag == 1) {
            /* write */ set.add(25);
        } else {
            set.add(35);
        }
        /* Simulate many operations that don't affect the relevant outcome */
        for (int num : set) {
            int tempVar = num * 5 - unrelatedVar;
            if (tempVar % 3 == 0) {
                set.remove(num);
                set.add(tempVar);
            }
        }
        /* read */ boolean contains25 = set.contains(25);
        System.out.println("Contains 25: " + contains25);
    }
}
