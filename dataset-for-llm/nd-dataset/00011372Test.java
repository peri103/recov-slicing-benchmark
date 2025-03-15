import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "SAT";
        // Block 2:
        String[] d = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT", "a"};
        // Block 3:
        java.util.Collections.reverse(java.util.List.of(d));
        // Block 4:
        System.out.println(java.util.Arrays.asList(d).indexOf(s));
        // Block END.
    }
    }
}
