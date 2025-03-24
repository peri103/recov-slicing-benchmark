import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(3); 
        set.add(5);
        set.add(7);
        set.add(9);
        int toggle = 10;
        int sum = 0;
        for (int i = 0; i < toggle; i++) {
            sum += i;
        }
        if (sum % 2 == 0) {
            /* write */ set.add(14);
        } else {
            set.add(15);
        }
        if (toggle > 5) set.add(21); else set.add(18);
        set.remove(3);
        set.remove(5);
        Integer[] array = set.toArray(new Integer[0]);
        /* read */ int ret = array[2];
        System.out.println(ret);
    }
}