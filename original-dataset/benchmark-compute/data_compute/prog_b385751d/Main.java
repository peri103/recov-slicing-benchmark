import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            set.add(i * 2);
        }
        int randomCheck = random.nextInt(10);
        if (randomCheck > 5) {
            set.add(100); 
        } else {
            set.add(101); 
        }
        Integer[] setArray = set.toArray(new Integer[0]);
        int calculatedIndex;
        if (setArray.length > 10) {
            calculatedIndex = 4;
        } else {
            calculatedIndex = 2;
        }
        /* write */ set.add(calculatedIndex * 10 + 1);
        if (set.contains(5)) {
            set.remove(4);
        } else {
            set.add(5);
        }
        set.add(20); 
        set.remove(3); 
        if (randomCheck % 2 == 0) {
            set.add(30);
        } else {
            set.remove(20);
        }
        /* read */ int ret = setArray[1];  
        System.out.println(ret);
    }
}
