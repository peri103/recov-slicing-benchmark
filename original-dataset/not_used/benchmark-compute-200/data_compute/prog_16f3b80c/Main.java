import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int magicNumber = 50;
        int randomFactor = 42;
        int result = magicOperation(magicNumber, randomFactor);
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        list.remove(new Integer(3));
        list.addFirst(-1);
        /* other operations */
        int index = result % 5;
        boolean condition = (index % 2 == 0);
        if (condition) {
            list.addLast(index);
        }
        list.removeLast();
        /* write */ list.add(1, randomFactor);
        list.push(index * 2);
        list.addFirst(result);
        /* read */ int ret = list.get(1);
        System.out.println("The retrieved value is: " + ret);
    }
    private static int magicOperation(int a, int b) {
        return (a + b) * 3 - b / 2;
    }
}
