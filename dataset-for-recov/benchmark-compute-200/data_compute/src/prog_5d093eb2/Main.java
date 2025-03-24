import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        int flag = complexCalculation();
        if (Math.random() > 0.5) {
            set.remove(30);
            set.add(40);
        } else {
            set.add(50);
        }
        int fakeRead = set.size();
        int unrelatedComputation = 5 * 10;
        if (flag > 100) {
            /* write */set.add(70);
        }
        boolean decision = decide(unrelatedComputation);
        if (decision) {
            set.add(80);
        } else {
            set.remove(10);
        }
        /* read */boolean ret = set.contains(70);
        System.out.println("Result of read: " + ret);
    }
    private static int complexCalculation() {
        return (int)(Math.random() * 200);
    }
    private static boolean decide(int val) {
        return val % 2 == 0;
    }
}