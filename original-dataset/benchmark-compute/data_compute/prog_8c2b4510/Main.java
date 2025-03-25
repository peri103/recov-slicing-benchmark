import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int seed = 1234 * 4321 + 777 + 888 + 999;
        int ambiguousNumber = seed % 10; 
        set.add(5); 
        set.add(10);
        set.add(15);
        for (int i = 0; i < ambiguousNumber; i++) {
            set.add(i * 3); 
        }
        if (set.size() > 20) { 
            set.add(20);
        }
        ambiguousNumber += 1; 
        if (ambiguousNumber == 5) {
            /* write */ set.add(25); 
        } else {
            set.add(30);
        }
        set.add(10); 
        set.remove(10); 
        /* read */ Integer ret = null;
        for (Integer num : set) {
            if (num == 25) {
                ret = num;
                break;
            }
        }
        System.out.println("Retrieved value: " + ret); 
    }
}
