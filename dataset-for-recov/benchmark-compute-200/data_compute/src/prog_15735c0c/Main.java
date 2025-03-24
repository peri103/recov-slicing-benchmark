import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        int decisionFactor = complexComputation();
        if (decisionFactor % 2 == 0) {
            /* write */ treeSet.add(25);
        } else {
            treeSet.add(15);
        }
        treeSet.add(35);
        treeSet.remove(10);
        treeSet.add(5);
        modifyTreeSet(treeSet);
        /* read */ int ret = treeSet.higher(22);
        System.out.println("Read value: " + ret);
    }
    private static int complexComputation() {
        int rand = 135 * 45 + 777; 
        int another = (rand / 3) - 99; 
        return another;
    }
    private static void modifyTreeSet(TreeSet<Integer> treeSet) {
        treeSet.add(8);
        treeSet.add(40);
        treeSet.pollFirst();
        treeSet.add(18);
    }
}
