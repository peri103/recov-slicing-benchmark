import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 2);
        }
        int misleadingIndex = calculateMisleadingIndex();
        list.add(misleadingIndex, 42);
        /* write */ list.add(100 + calculateOffset());
        if (Math.random() > 0.5) {
            list.remove(0);
        } else {
            list.add(50);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) list.set(i, list.get(i) + 1);
        }
        /* read */ int ret = list.get(5);
        System.out.println("Read value: " + ret);
    }
    private static int calculateMisleadingIndex() {
        int a = 2351;
        int b = 4223;
        int calc = (a * b) % 7;
        return calc;
    }
    private static int calculateOffset() {
        int c = 127;
        int d = 9;
        int calc = (c * d + d * d) / 17;
        return calc;
    }
}
