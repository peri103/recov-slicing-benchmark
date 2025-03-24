import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(100);
        set.add(200);
        set.add(300);
        /* other operations */
        int a = 50, b = 100;
        /* other operations */
        boolean decision = (a + b) % 2 == 0;
        /* misleading write */ set.add(400);
        /* Internal check */ if (decision) {
            /* write */ set.add(150);
        } else {
            set.add(250);
        }
        /* other operations */
        set.add(50);
        set.remove(50);
        set.remove(400);
        set.add(200);  
        set.add(300);  
        /* read */ Integer ret = set.ceiling(150);
        System.out.println("Value retrieved: " + ret);
    }
}
