import java.util.concurrent.CopyOnWriteArrayList;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(5);
        list.add(10);
        int x = complexCalculation(42);
        /* Interleaved operations that don't affect read result directly */
        if (x > 100) {
            list.add(20);
        }
        list.add(x);
        /* Misleading modification */
        list.set(1, 50);
        list.add(4, 30);
        list.add(2, 15);
        list.remove(2);
        /* write */ list.add(1, 25); 
        /* read */ int ret = list.get(2);
        System.out.println("Ret value: " + ret);
    }
    private static int complexCalculation(int input) {
        return input * 3 + (input / 2) - (input % 3);
    }
}
