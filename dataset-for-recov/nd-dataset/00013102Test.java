import org.junit.jupiter.api.Test;

class _00013102Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String x = "5";
        // Block 2:
        String[] list = {"3", "5", "7"};
        // Block 3:
        boolean found = false;
        for (String item : list) {
            if (item.equals(x)) {
                found = true;
                break;
            }
        }
        if (found) {
            // Block 4:
            System.out.println("YES");
        } else {
            // Block 5:
            // Block 6:
            System.out.println("NO");
        }
        // Block END.
    }
    }

