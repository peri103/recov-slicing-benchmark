import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "happy,newyear,enjoy";
        // Block 2:
        String x = S.substring(0, 5) + " " + S.substring(6, 13) + " " + S.substring(14);
        // Block 3:
        System.out.println(x);
        // Block END.
    }
    }
}
