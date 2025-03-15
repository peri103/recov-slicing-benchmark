import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 100, a = 100, b = 100;
        // Block 2:
        int ma = Math.min(a, b);
        // Block 3:
        int mi = Math.max(ma - (n - Math.max(a, b)), 0);
        // Block 4:
        System.out.println(ma + " " + mi);
        // Block END.
    }
    }

