import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = 10, b = 0, c = 12, d = 0, e = 120;
        // Block 2:
        int f = (c - a) * 60;
        // Block 3:
        f += (d - b);
        // Block 4:
        System.out.println(f - e);
        // Block END.
    }
    }
}
