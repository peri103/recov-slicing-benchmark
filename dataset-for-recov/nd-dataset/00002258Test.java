import org.junit.jupiter.api.Test;

class _00002258Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = 10, b = 7, c = 5;
        // Block 2:
        System.out.println(Math.min(b, c) + " " + (b + c >= a ? (b + c - a) : 0));
        // Block END.
    }
    }

