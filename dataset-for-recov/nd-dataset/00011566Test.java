import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "SUN";
        // Block 2:
        String[] l = { "0", "SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN" };
        // Block 3:
        System.out.println(java.util.Arrays.asList(l).indexOf(s));
        // Block END.
    }
    }

