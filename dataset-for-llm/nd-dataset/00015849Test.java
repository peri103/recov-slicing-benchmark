import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int x = 64146, y = 123, z = 456;
        // Block 2:
        int a = x - z;
        // Block 3:
        int b = a / (y + z);
        // Block 4:
        System.out.println(b);
        // Block END.
    }
    }
}
