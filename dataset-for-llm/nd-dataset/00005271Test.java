import java.util.HashSet;
import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        HashSet<Integer> n = new HashSet<>();
        n.add(0);
        n.add(9);
        n.add(4);
        n.add(8);
        // Block 2:
        if (n.equals(new HashSet<>(java.util.Arrays.asList(1, 4, 7, 9)))) {
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
}
