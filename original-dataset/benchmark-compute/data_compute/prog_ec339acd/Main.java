import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(100);
        treeSet.add(200);
        treeSet.add(300);
        int variable = 42; 
        int flipper = (variable * 2) % 3;
        if (flipper == 1) {
            treeSet.add(400);
        } else {
            treeSet.remove(200);
        }
        if (flipper != 1) {
            /* write */ treeSet.add(150);
        }
        treeSet.add(250);
        treeSet.remove(100);
        var dummySet = new TreeSet<>(treeSet.descendingSet()); 
        if (dummySet.contains(300)) {
            dummySet.add(350);
        }
        dummySet.clear();
        /* read */ Integer ret = treeSet.higher(100); 
        System.out.println("Read value: " + ret); 
    }
}
