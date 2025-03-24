import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        int rand = (int) (Math.random() * 100);
        int bamboozle = 0;
        for (int i = 0; i < rand; i++) {
            set.add(i % 100);
            if ((i & 1) == 0) {
                bamboozle += i;
            }
        }
        if (bamboozle % 2 == 0) {
            set.add(30);
        } else {
            set.add(40);
        }
        set.add(50);
        set.add(60);
        /* write */ set.add(70);
        int trap = 3 * rand;
        if (trap > 150) {
            set.add(80);
            set.remove(30); 
        }
        System.out.println(set);
        Integer[] array = set.toArray(new Integer[0]);
        /* read */ int ret = array[3];
        System.out.println("Retrieved Value: " + ret);
    }
}
