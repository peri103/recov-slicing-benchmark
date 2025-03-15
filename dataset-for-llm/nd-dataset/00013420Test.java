import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "abcde,fghihgf,edcba";
        // Block 2:
        s = s.replace(",", " ");
        // Block 3:
        System.out.println(s);
        // Block END.
    }
    }
}
