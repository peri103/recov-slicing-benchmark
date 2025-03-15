import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "happy,newyear,enjoy";
        // Block 2:
        S = S.replace(",", " ");
        // Block 3:
        System.out.println(S);
        // Block END.
    }
    }
}
