import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String[] base = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        // Block 2:
        String S = "SUN";
        // Block 3:
        if (Arrays.asList(base).indexOf(S) == -1) System.exit(0);
        // Block 4:
        System.out.println(7 - Arrays.asList(base).indexOf(S));
        // Block END.
    }
    }
}
