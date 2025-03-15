import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 2;
        // Block 2:
        int[] a = {1, 5};
        // Block 3:
        int[] b = {2, 4};
        // Block 4:
        int[] c = {3, 6};
        // Block 5:
        Arrays.sort(a);
        // Block 6:
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        // Block 7:
        Arrays.sort(b);
        // Block 8:
        for (int i = 0; i < b.length / 2; i++) {
            int temp = b[i];
            b[i] = b[b.length - 1 - i];
            b[b.length - 1 - i] = temp;
        }
        // Block 9:
        Arrays.sort(c);
        // Block 10:
        for (int i = 0; i < c.length / 2; i++) {
            int temp = c[i];
            c[i] = c[c.length - 1 - i];
            c[c.length - 1 - i] = temp;
        }
        // Block 11:
        ArrayList<Integer> cList = new ArrayList<>();
        for (int value : c) {
            cList.add(value);
        }
        cList.add(0);
        // Block 12:
        int i = 0;
        // Block 13:
        ArrayList<Integer> l = new ArrayList<>();
        // Block 14:
        for (int j : b) {
            // Block 15:
            while (cList.get(i) > j) {
                // Block 16:
                i++;
            }
            // Block 17:
            l.add(i);
        }
        // Block 18:
        b = Arrays.copyOf(b, b.length + 1);
        b[b.length - 1] = 0;
        // Block 19:
        int s = 0;
        // Block 20:
        int cnt = 0;
        // Block 21:
        i = 0;
        // Block 22:
        for (int j : a) {
            // Block 23:
            while (b[i] > j) {
                // Block 24:
                s += l.get(i);
                // Block 25:
                i++;
            }
            // Block 26:
            cnt += s;
        }
        // Block 27:
        System.out.println(cnt);
        // Block END.
    }
    }

