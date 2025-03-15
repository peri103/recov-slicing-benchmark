import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 5;
        // Block 2:
        int[] L = {6, 9, 4, 2, 11};
        // Block 3:
        Arrays.sort(L);
        // Block 4:
        int maxL = L[L.length - 1];
        // Block 5:
        double[] li = new double[L.length];
        for (int i = 0; i < L.length; i++) {
            li[i] = Math.abs(L[i] - maxL / 2.0);
        }
        // Block 6:
        int a = 0;
        for (int i = 1; i < li.length; i++) {
            if (li[i] < li[a]) {
                a = i;
            }
        }
        // Block 7:
        System.out.println(maxL + ", " + L[a]);
        // Block END.
    }
    }
}
