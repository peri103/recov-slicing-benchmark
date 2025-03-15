import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        // Block 2:
        System.out.println(7 - java.util.Arrays.asList(week).indexOf("SAT"));
        // Block END.
    }
    }
}
