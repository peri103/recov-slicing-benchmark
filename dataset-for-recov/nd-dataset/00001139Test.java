import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String str_n = "750";
        // Block 2:
        int temp = Character.getNumericValue(str_n.charAt(0));
        // Block 3:
        temp = 111 * temp;
        // Block 4:
        int int_n = Integer.parseInt(str_n);
        // Block 5:
        if (int_n > temp) {
            // Block 6:
            temp = Character.getNumericValue(str_n.charAt(0));
            // Block 7:
            temp = temp + 1;
            // Block 8:
            System.out.println(111 * temp);
        }
        // Block 9:
        else {
            // Block 10:
            temp = Character.getNumericValue(str_n.charAt(0));
            // Block 11:
            System.out.println(111 * temp);
        }
        // Block END.
    }
    }

