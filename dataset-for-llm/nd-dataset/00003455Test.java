import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = 20, b = 15;
        // Block 2:
        int temp = a - 2 * b;
        // Block 3:
        int ans = (temp > 0) ? temp : 0;
        // Block 4:
        System.out.println(ans);
        // Block END.
    }
    }
}
