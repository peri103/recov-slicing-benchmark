import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int num = 5;
        // Block 2:
        if (num % 2 == 0) { 
            // Block 3:
            System.out.println(num / 2);
        }
        // Block 4:
        else {
            // Block 5:
            System.out.println(num / 2 + 1);
        }
        // Block END.
    }
    }
}
