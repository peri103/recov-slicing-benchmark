import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "SUN";
        // Block 2:
        String[] A = {"a", "SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN"};
        // Block 3:
        System.out.println(java.util.Arrays.asList(A).indexOf(S));
        // Block END.
    }
    }
}
