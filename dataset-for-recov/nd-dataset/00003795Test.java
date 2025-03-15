import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int X = 64146, Y = 123, Z = 456;
        // Block 2:
        X -= Z;
        // Block 3:
        System.out.println(X / (Y + Z));
        // Block END.
    }
    }

