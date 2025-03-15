import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 750;
        // Block 2:
        int h = n / 100;
        // Block 3:
        int x = h * 100 + h * 10 + h;
        // Block 4:
        if (n <= x) {
            System.out.println(x);
        } else {
            System.out.println(x + 111);
        }
        // Block END.
    }
    }
}
