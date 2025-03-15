import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class _00002488Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        Set<Integer> n1 = new HashSet<>();
        n1.add(1);
        n1.add(2);
        n1.add(9);
        // Block 2:
        Set<Integer> n2 = new HashSet<>();
        n2.add(1);
        n2.add(7);
        n2.add(9);
        n2.add(4);
        // Block 3:
        String ans = n1.equals(n2) ? "YES" : "NO";
        // Block 4:
        System.out.println(ans);
        // Block END.
    }
    }

