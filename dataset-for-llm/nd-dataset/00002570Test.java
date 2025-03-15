import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int[] n = Arrays.stream("1 2 9 1".split(" ")).mapToInt(Integer::parseInt).toArray();
        // Block 2:
        if (Arrays.equals(new int[]{1, 4, 7, 9}, Arrays.stream(n).sorted().toArray())) {
            // Block 3:
            System.out.println("YES");
        // Block 4:
        } else {
            // Block 5:
            System.out.println("NO");
        }
        // Block END.
    }
    }
}
