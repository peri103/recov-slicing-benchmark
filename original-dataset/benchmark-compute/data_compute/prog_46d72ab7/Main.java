import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        int alpha = 15;
        int beta = 25;
        if (alpha > 10 && beta < 30) {
            set.add(50);
            set.remove(20);
        }
        set.add(5);
        set.remove(30);
        if (alpha < beta) {
            set.add(25);
        } else {
            set.add(35);
        }
        set.add(15);
        set.remove(10);
        int setSize = set.size();
        System.out.println("Intermediate Size of Set: " + setSize);
        /* write */int nthElement = set.headSet(35).size();
        /* read */int ret = (Integer) set.toArray()[nthElement];
        System.out.println("Read Value: " + ret);
    }
}