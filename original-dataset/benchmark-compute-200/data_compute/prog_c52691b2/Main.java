import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        /* Initial population of the list with random elements */
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));
        }
        for (int i = 0; i < 5; i++) {
            list.add(i * 2);
        }
        /* Other operations to confuse static analysis */
        int indexToWrite = rand.nextInt(100) % list.size();
        int irrelevantIndex = indexToWrite;
        if (indexToWrite % 3 == 0) {
            list.add(1, 1001);
        } else {
            list.add(2, 2002);
        }
        /* write */ list.set(1, 123);
        int temporaryValue = list.get(indexToWrite);
        list.add(rand.nextInt(100));
        /* read */ int ret = list.get(1); 
        System.out.println("Value of ret: " + ret);
    }
}