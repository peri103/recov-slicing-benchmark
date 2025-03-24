import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        int x = 5;
        int y = 15;
        if (x + y > 20) {
            arrayList.add(40); 
        }
        arrayList.add(50); 
        if ((x * 2 + y) % 5 == 0) {
            /* write */ arrayList.set(1, 25);
        }
        y = y - x + arrayList.get(0) * 2;
        if (y % 3 == 0) {
            arrayList.add(60); 
        }
        arrayList.add(70); 
        arrayList.remove(2); 
        int index = (x + y > 50) ? 0 : 1;
        /* read */ int ret = arrayList.get(index + 1);
        System.out.println(ret);
    }
}
