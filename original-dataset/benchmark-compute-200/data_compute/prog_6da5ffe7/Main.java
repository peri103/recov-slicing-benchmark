import java.util.concurrent.CopyOnWriteArraySet;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        int interimCalc = 42; 
        boolean toggle = false;
        /* Write point */
        if (interimCalc % 2 == 0) {
            set.add(100); 
            toggle = true;
        }
        set.add(200);
        set.add(300);
        set.remove(200); 
        if (toggle) {
            set.add(400); 
        } else {
            set.add(500);
        }
        Integer[] orderedSet = set.toArray(new Integer[0]);
        /* Read */
        int ret = orderedSet[0];
        System.out.println("Read value: " + ret);
    }
}