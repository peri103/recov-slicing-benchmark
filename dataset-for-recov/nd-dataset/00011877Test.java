import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String M1 = "11";
        String D1 = "30";
        // Block 2:
        String M2 = "12";
        String D2 = "1";
        // Block 3:
        M1 = Integer.parseInt(M1);
        // Block 4:
        M2 = Integer.parseInt(M2);
        // Block 5:
        if (M1 != M2) {
            // Block 6:
            System.out.println("1");
        }
        // Block 7:
        else {
            // Block 8:
            System.out.println("0");
        }
        // Block END.
    }
    }

