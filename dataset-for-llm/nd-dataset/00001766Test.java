import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 10, a = 3, b = 5;
        // Block 2:
        int ans1 = Math.min(a, b);
        // Block 3:
        int ans2 = a + b - n;
        // Block 4:
        ans2 = Math.max(ans2, 0);
        // Block 5:
        System.out.println(ans1 + " " + ans2);
        // Block END.
    }
    }
}
