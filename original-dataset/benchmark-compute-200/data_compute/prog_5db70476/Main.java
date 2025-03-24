import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 2);
        }
        int randValue = (int) Math.pow(3, 3);
        int misleadingIndex = randValue % 4;
        for (int j = 0; j < 5; j++) {
            list.add(j + 100);
        }
        list.remove(0);
        if (list.size() > 12) {
            list.set(2, 999);
            /* write */list.add(0, 42);
        } else {
            list.add(0, 84);
        }
        misleadingIndex = list.get(2);
        list.remove(misleadingIndex);
        list.set(3, 55);
        /* read */int ret = list.get(0);
        System.out.println("Read value: " + ret);
    }
}