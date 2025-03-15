import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 5;
        // Block 2:
        int ans = N / 2;
        // Block 3:
        ans += (N % 2 != 0) ? 1 : 0;
        // Block 4:
        System.out.println(ans);
        // Block END.
    }
    }
}
