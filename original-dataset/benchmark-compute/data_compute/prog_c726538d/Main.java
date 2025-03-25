import java.util.concurrent.CopyOnWriteArrayList;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(10); 
        /* other operations */
        int a = (int) (Math.random() * 100);
        for (int i = 0; i < 5; i++) {
            list.add(a + i);
        }
        /* write */ list.add(99); 
        if (a % 2 == 0) {
            list.add(42);
        } else {
            list.add(43);
        }
        list.remove(0); 
        if (a % 3 == 0) {
            list.add(50);
            list.set(1, 200); 
        }
        list.add(500); 
        list.remove(2);
        /* other operations */
        /* read */ int ret = list.get(1); 
        System.out.println("Retrieved value: " + ret);
    }
}
