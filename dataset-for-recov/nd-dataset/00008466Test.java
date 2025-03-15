import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 1;
        // Block 2:
        int[] a1 = {2};
        // Block 3:
        int[] a2 = {3};
        // Block 4:
        int[] b1 = {0};
        // Block 5:
        int[] b2 = {0};
        // Block 6:
        for (int i = 0; i < n; i++) {
            // Block 7:
            b1 = append(b1, b1[b1.length - 1] + a1[i]);
            // Block 8:
            b2 = append(b2, b2[b2.length - 1] + a2[i]);
        }
        // Block 9:
        int ans = 0;
        // Block 10:
        for (int i = 0; i < n; i++) {
            // Block 11:
            int tmp = b1[i + 1] + b2[b2.length - 1] - b2[i];
            // Block 12:
            ans = Math.max(ans, tmp);
        }
        // Block 13:
        System.out.println(ans);
        // Block END.
    }

    private static int[] append(int[] array, int value) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = value;
        return newArray;
    }
    }
}
