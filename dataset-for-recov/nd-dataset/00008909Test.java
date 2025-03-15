import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 5;
        // Block 2:
        int[] a1 = {3, 2, 2, 4, 1};
        // Block 3:
        int[] a2 = {1, 2, 2, 2, 1};
        // Block 4:
        for (int i = 0; i < a2.length / 2; i++) {
            int temp = a2[i];
            a2[i] = a2[a2.length - 1 - i];
            a2[a2.length - 1 - i] = temp;
        }
        // Block 5:
        ArrayList<Integer> asum1 = new ArrayList<>();
        // Block 6:
        ArrayList<Integer> asum2 = new ArrayList<>();
        // Block 7:
        int tmp1 = 0;
        // Block 8:
        int tmp2 = 0;
        // Block 9:
        for (int i = 0; i < n; i++) {
            // Block 10:
            tmp1 += a1[i];
            // Block 11:
            asum1.add(tmp1);
            // Block 12:
            tmp2 += a2[i];
            // Block 13:
            asum2.add(tmp2);
        }
        // Block 14:
        Collections.reverse(asum2);
        // Block 15:
        ArrayList<Integer> asum = new ArrayList<>();
        for (int i = 0; i < asum1.size(); i++) {
            asum.add(asum1.get(i) + asum2.get(i));
        }
        // Block 16:
        System.out.println(Collections.max(asum));
        // Block END.
    }
    }
}
