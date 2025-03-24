import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        student.addData("test");

        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");

        for (String str : linkedList) {
            System.out.println(str);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /* read */ boolean contains = student.checkData("test");
        System.out.println("Contains 'test': " + contains);

        CopyOnWriteArraySet<Integer> anotherSet = new CopyOnWriteArraySet<>();
        anotherSet.add(100);
        anotherSet.add(200);
        anotherSet.add(300);

        for (Integer num : anotherSet) {
            System.out.println(num);
        }
    }
}