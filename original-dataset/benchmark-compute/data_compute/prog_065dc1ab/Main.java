import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        int randomNumber = 1024 * 2048 % 77777;

        int divider = randomNumber % 1000;

        treeSet.add(42);
        treeSet.add(56);
        treeSet.add(75);

        boolean complexCondition = (divider % 2 == 0);
        for (int i = 0; i < 5; i++) {
            int candidate = randomNumber + i;
            if (candidate > 100) {
                treeSet.add(candidate);
            } else {
                treeSet.add(-candidate);
            }
        }

        if (complexCondition) {
            /* write */ treeSet.add(60);
        } else {
            treeSet.add(90);
        }
        treeSet.remove(75);
        treeSet.add(100);
        treeSet.remove(100);
        /* read */int ret = treeSet.ceiling(55);
        System.out.println("Read value: " + ret);
    }
}
