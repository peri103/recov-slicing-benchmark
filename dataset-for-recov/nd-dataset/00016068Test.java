import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int A = 20, B = 15;
        // Block 2:
        if (A - B * 2 < 0) {
            // Block 3:
            System.out.println("0");
        }
        // Block 4:
        else {
            // Block 5:
            System.out.println(A - B * 2);
        }
        // Block END.
    }
    }
}
