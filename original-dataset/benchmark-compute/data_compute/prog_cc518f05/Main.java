import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10); 
        set.add(20);
        set.add(30);
        int misleadingVar = 42;
        if (misleadingVar % 2 == 0) {
            /* write */ set.add(25);
        }
        misleadingVar += 1;
        set.remove(20); 
        set.add(35); 
        int unrelatedSum = 0;
        for (int i = 0; i < 10; i++) {
            unrelatedSum += i;
            set.add(i); 
        }
        if (unrelatedSum > 20) {
            set.add(40);
        }
        /* read */ boolean exists = set.contains(25);
        System.out.println("Does 25 exist in the set? " + exists);
    }
}
