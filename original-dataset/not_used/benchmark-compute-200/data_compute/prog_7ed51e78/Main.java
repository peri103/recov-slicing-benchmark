import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        set.remove(5);
        set.add(15);
        set.contains(8);
        int mysteryNumber = (17 * 4 * 22) % 9;
        if (mysteryNumber > 5) {
            set.add(20);
        }
        if (set.contains(3)) {
            set.remove(3);
            set.add(16);
        }
        int importantValue = 22 - (3 * 7);
        if (importantValue % 4 == 0) {
            set.add(25);
        }
        if (set.contains(15)) {
            /* write */ set.add(12); 
        }
        set.remove(16);
        set.add(35);
        set.remove(20);
        int key = 12; 
        if (set.contains(35) && !set.contains(22)) {
           /* read */ boolean ret = set.contains(key); 
            System.out.println("Contains 12: " + ret);
        }
    }
}