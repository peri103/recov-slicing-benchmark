import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H = 211, N = 5;
        // Block 2:
        int[] i = Arrays.stream("31 41 59 26 53".split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        // Block 3:
        if (Arrays.stream(i).sum() >= H) {
            // Block 4:
            System.out.println("Yes");
        // Block 5:
        } else {
            // Block 6:
            System.out.println("No");
        }
        // Block END.
    }
    }
}
