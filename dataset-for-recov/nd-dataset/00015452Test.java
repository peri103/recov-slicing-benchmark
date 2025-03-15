import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int x = 100000, y = 1, z = 1;
        // Block 2:
        int rm = x % (y + z);
        // Block 3:
        int a = (rm < z) ? -1 : 0;
        // Block 4:
        System.out.println(x / (y + z) + a);
        // Block END.
    }
    }
}
