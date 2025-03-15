import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "0112";
        // Block 2:
        if (s.substring(0, 2).matches("01|02|03|04|05|06|07|08|09|10|11|12")) {
            // Block 3:
            String l = "m";
            // Block 4:
        } else {
            // Block 5:
            String l = "y";
        }
        // Block 6:
        if (s.substring(2, 4).matches("01|02|03|04|05|06|07|08|09|10|11|12")) {
            // Block 7:
            String r = "m";
            // Block 8:
        } else {
            // Block 9:
            String r = "y";
        }
        // Block 10:
        if (l + r.equals("mm")) {
            // Block 11:
            System.out.println("AMBIGUOUS");
        // Block 12:
        } else if (l + r.equals("my")) {
            // Block 13:
            System.out.println("MMYY");
        // Block 14:
        } else if (l + r.equals("ym")) {
            // Block 15:
            System.out.println("YYMM");
        // Block 16:
        } else {
            // Block 17:
            System.out.println("NA");
        }
        // Block END.
    }
    }

