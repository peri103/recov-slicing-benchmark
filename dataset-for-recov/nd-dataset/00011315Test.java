import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "SUN";
        // Block 2:
        if (s.equals("SUN")) {
            System.out.println(7);
        }
        // Block 3:
        else if (s.equals("MON")) {
            System.out.println(6);
        }
        // Block 4:
        else if (s.equals("TUE")) {
            System.out.println(5);
        }
        // Block 5:
        else if (s.equals("WED")) {
            System.out.println(4);
        }
        // Block 6:
        else if (s.equals("THU")) {
            System.out.println(3);
        }
        // Block 7:
        else if (s.equals("FRI")) {
            System.out.println(2);
        }
        // Block 8:
        else {
            System.out.println(1);
        }
        // Block END.
    }
    }

