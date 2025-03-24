import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        int a = 42;
        int b = a * 2;
        list.add(b % list.size()); 
        int c = b / 2;
        if (c > 20) {
            list.removeFirst(); 
        }
        list.add(1, 100);
        int d = list.size();
        if (d % 2 == 0) {
            list.addLast(d);
        } else {
            list.addFirst(d);
        }
        if (d > 3) {
            /* write */ list.add(1, 200);
        } else {
            list.set(1, 1000);
        }
        list.add(400);
        /* read */ int ret = list.get(1);
        System.out.println("The value at the read point is: " + ret);
    }
}
