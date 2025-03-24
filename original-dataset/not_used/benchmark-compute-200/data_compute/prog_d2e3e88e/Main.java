import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.remove(10);
        int a = 5 * 8 + 12;
        int b = a % 3;
        int c = 100 / (b + 1);
        int writeValue = 25; 
        if (c < 40) {
            /* write */ treeSet.add(15); 
        }
        treeSet.add(35);
        if (b == 0) {
            treeSet.add(writeValue); 
        } else {
            treeSet.add(45);
        }
        treeSet.remove(20);
        int target = c - b + 10;
        /* read */ int ret = treeSet.higher(14); 
        System.out.println("The retrieved value is: " + ret);
    }
}