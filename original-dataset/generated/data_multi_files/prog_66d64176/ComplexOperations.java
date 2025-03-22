import java.util.Set;
import java.util.HashSet;

public class ComplexOperations {
    private Set<Integer> hashSet = new HashSet<>();

    public void populateHashSet() {
        for (int i = 0; i < 5; i++) {
            hashSet.add(i * 5);
        }
    }

    public void printHashSet() {
        for (Integer num : hashSet) {
            System.out.println("HashSet contains: " + num);
        }
    }
}
