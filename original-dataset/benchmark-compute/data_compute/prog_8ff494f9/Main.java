import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        int rand = (int) (Math.random() * 10);

        /* write */list.add(10); 
        list.add(20); 
        list.add(30); 
        list.add(40); 

        if (rand % 2 == 0) {
            list.set(1, 99); 
        } else {
            list.set(2, 77); 
        }

        list.addFirst(5); 
        list.removeLast(); 
        list.add(2, 15); 

        /* read */ int ret = list.get(1); 
        System.out.println(ret);
    }
}
