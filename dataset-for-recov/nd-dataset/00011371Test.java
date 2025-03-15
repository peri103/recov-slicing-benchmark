import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "SUN";
        // Block 2:
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        // Block 3:
        int ans = 7 - java.util.Arrays.asList(week).indexOf(S);
        // Block 4:
        System.out.println(ans);
        // Block END.
    }
    }

