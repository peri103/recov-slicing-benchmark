import java.util.concurrent.CopyOnWriteArraySet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet set = new CopyOnWriteArraySet();
        ArrayList list = new ArrayList();
        LinkedList linkedList = new LinkedList();
        
        /* write */ set.add(1);
        
        list.add("Hello");
        linkedList.add(100);
        
        for (Object obj : list) {
            System.out.println(obj);
        }
        
        for (Object obj : linkedList) {
            System.out.println(obj);
        }
        
        /* read */ boolean contains = set.contains(1);
        System.out.println("Set contains 1: " + contains);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        for (int num : numbers) {
            System.out.println(num);
        }
        
        CopyOnWriteArraySet anotherSet = new CopyOnWriteArraySet();
        anotherSet.add("World");
        
        System.out.println("Another set contains 'World': " + anotherSet.contains("World"));
    }
}