import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        int x = 10;
        int y = 20;
        int z = x * y + 50;
        if (z % 2 == 0) {
            list.add(400);
        } else {
            list.add(500);
        }
        int temp = z / 2 - 5;
        for (int i = 0; i < 3; i++) {
            list.add(i + 10);
        }
        if (temp > 10) {
            /* write */ list.set(1, 250); 
        }
        list.add(600);
        list.add(700);
        list.remove(0);
        list.set(0, 1234);
        list.add(800);
        list.add(900);
        list.remove(list.size() - 1);
        /* read */ int ret = list.get(1);
        System.out.println("Read value: " + ret);
    }
}