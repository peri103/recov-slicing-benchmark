import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);  
        list.add(20);  
        list.add(30);  
        list.add(40);  
        int x = list.size() * 10 - 5;
        if (x > 30 && list.get(0) < 50) {
            list.set(1, x + 1);
        } else {
            list.set(2, x - 3);
        }
        list.removeFirst();
        boolean conditionalVar = list.get(1) == 20; 
        if (conditionalVar || x < 50) {
            /* write */ list.add(1, 99);  
        } else {
            list.addLast(50);
        }
        list.add(5);  
        list.addAll(list);  
        /* read */ int ret = list.get(1);  
        System.out.println("Value of ret: " + ret);
    }
}