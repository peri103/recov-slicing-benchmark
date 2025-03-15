import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = 100000, b = 1, c = 1;
        // Block 2:
        a -= c;
        // Block 3:
        System.out.println(a / (b + c));
        // Block END.
    }
    }
}
