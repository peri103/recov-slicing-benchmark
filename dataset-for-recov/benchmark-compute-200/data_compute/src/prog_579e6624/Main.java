import java.util.LinkedHashSet;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        int magicNumber = 123 * 456 % 789;
        if (magicNumber % 2 == 0) {
            set.add(40);
        } else {
            /* write */ set.add(25); 
        }
        set.add(50); 
        if (set.contains(20)) {
            set.add(60);
        } else {
            set.add(70);
        }
        set.remove(10); 
        /* misleading operation */ int mislead = set.contains(99) ? 99 : 0;
        /* read */ int ret = getAtIndex(set, 2);
        System.out.println("Read value: " + ret);
    }
    private static int getAtIndex(LinkedHashSet<Integer> set, int index) {
        Iterator<Integer> iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            int current = iterator.next();
            if (i == index) return current;
            i++;
        }
        throw new IndexOutOfBoundsException("Index: " + index);
    }
}
