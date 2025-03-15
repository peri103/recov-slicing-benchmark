import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "SAT";
        // Block 2:
        int output = 0;
        if (S.equals("SUN")) {
            // Block 3:
            output = 7;
        // Block 4:
        } else if (S.equals("MON")) {
            // Block 5:
            output = 6;
        // Block 6:
        } else if (S.equals("TUE")) {
            // Block 7:
            output = 5;
        // Block 8:
        } else if (S.equals("WED")) {
            // Block 9:
            output = 4;
        // Block 10:
        } else if (S.equals("THU")) {
            // Block 11:
            output = 3;
        // Block 12:
        } else if (S.equals("FRI")) {
            // Block 13:
            output = 2;
        // Block 14:
        } else if (S.equals("SAT")) {
            // Block 15:
            output = 1;
        }
        // Block 16:
        System.out.println(output);
        // Block END.
    }
    }
}
