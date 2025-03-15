import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "abcde,fghihgf,edcba";
        // Block 2:
        System.out.println(String.join(" ", s.split(",")));
        // Block END.
    }
    }
}
