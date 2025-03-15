import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "1111111111";
        // Block 2:
        int n = s.length();
        // Block 3:
        int ret = 753;
        // Block 4:
        for (int i = 0; i < n - 2; i++) {
            // Block 5:
            int x = Math.abs(753 - Integer.parseInt(s.substring(i, i + 3)));
            // Block 6:
            ret = Math.min(x, ret);
        }
        // Block 7:
        System.out.println(ret);
        // Block END.
    }
    }

