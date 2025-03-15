import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 10, a = 7, b = 5;
        // Block 2:
        int and_ = Math.min(a, b);
        // Block 3:
        int or_ = Math.max(0, a + b - n);
        // Block 4:
        System.out.println(and_ + " " + or_);
        // Block END.
    }
    }

