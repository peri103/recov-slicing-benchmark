import java.util.HashSet;
import org.junit.jupiter.api.Test;

class _00002685Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        HashSet<Integer> n = new HashSet<>();
        n.add(1);
        n.add(4);
        n.add(9);
        n.add(7);
        // Block 2:
        if (n.equals(new HashSet<>(java.util.Arrays.asList(1, 7, 9, 4)))) {
            // Block 3:
            System.out.println("YES");
        }
        // Block 4:
        else {
            // Block 5:
            System.out.println("NO");
        }
        // Block END.
    }
    }

