import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10); 
        list.add(20); 
        int foo = 42;
        /* other operations */
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        list.remove(0); 
        list.addLast(70);
        boolean condition = (foo % 3 == 0);
        int misleadingIndex = condition ? 2 : 3;
        int anotherK = foo - list.get(misleadingIndex);
        /* write */ list.add(1, 99); 
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        /* other operations */
        if (sum > 200) {
            list.addFirst(30);
        } else {
            list.addLast(40);
        }
        /* other operations */
        list.removeIf(n -> (n % 4 == 0));
        /* read */ int ret = list.get(1);
    }
}
