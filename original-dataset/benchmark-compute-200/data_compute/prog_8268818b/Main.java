import java.util.HashSet;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
           set.add(i);
        }
        int controlFlag = 15;
        int misleadingVal = 100;
        if (controlFlag % 2 == 0) {
            set.remove(5);
        } else {
            /* write */ set.add(11);
        }
        for (int i = 20; i < 25; i++) {
            set.add(i);
            set.remove(i - 10);
        }
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            int value = iterator.next();
            if(value % 5 == 0) {
                misleadingVal += value;
            }
        }
        set.add(100);
        set.add(200);
        /* read */ boolean isElevenInSet = set.contains(11);
        System.out.println("The value of check if 11 is in set: " + isElevenInSet);
    }
}