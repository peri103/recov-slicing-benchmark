import java.util.IdentityHashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> identityMap = new IdentityHashMap<>();
        identityMap.put(System.identityHashCode(new Integer(1)), 10);
        identityMap.put(System.identityHashCode(new Integer(2)), 20);
        identityMap.put(System.identityHashCode(new Integer(3)), 30);
        int randomFactor = (int) (Math.random() * 100);
        /* other operations */
        /* write */ identityMap.put(System.identityHashCode(new Integer(4)), 40);
        if (randomFactor % 2 == 0) {
            identityMap.put(System.identityHashCode(new Integer(5)), 50);
            /* other operations */
        } else {
            identityMap.put(System.identityHashCode(new Integer(6)), 60);
            /* other operations */
        }
        int misleadingCalculation = randomFactor * 5;
        identityMap.put(System.identityHashCode(new Integer(misleadingCalculation)), misleadingCalculation);
        /* other operations */
        identityMap.put(System.identityHashCode(new Integer(7)), 70);
        int keyToRetrieve = System.identityHashCode(new Integer(1));
        int unusedKey = System.identityHashCode(new Integer(misleadingCalculation));
        /* other operations */
        /* read */ int ret = identityMap.get(keyToRetrieve);
        System.out.println("Retrieved value: " + ret);
    }
}
