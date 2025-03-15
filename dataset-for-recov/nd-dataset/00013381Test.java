import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "abcde,fghihgf,edcba";
        // Block 2:
        System.out.println(s.substring(0, 5) + " " + s.substring(6, 13) + " " + s.substring(14, 20));
        // Block END.
    }
    }

