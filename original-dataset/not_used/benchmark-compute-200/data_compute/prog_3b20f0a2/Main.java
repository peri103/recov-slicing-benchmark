import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        int x = 100 - 95; 
        boolean flag = false;
        treeSet.add(5);
        treeSet.remove(5);
        treeSet.add(x+20);
        if (x == 5) {
            flag = true;
        }
        if (!flag) {
           /* write */treeSet.add(25);
        }
        else{
            treeSet.add(35);
        }
        treeSet.add(21);
        int a = 60;
        treeSet.add(a);
        a = 100;
        /* read */int ret = treeSet.higher(22);
        System.out.println("Retrieved value: " + ret);
    }
}
