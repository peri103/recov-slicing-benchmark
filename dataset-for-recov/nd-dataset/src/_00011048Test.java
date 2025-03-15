import org.junit.jupiter.api.Test;

class _00011048Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "level";
        // Block 2:
        int n = s.length();
        // Block 3:
        int x = n / 2;
        // Block 4:
        String a = s.substring(0, x);
        // Block 5:
        String b = s.substring(x + 1);
        // Block 6:
        if (a.equals(b)) {
            System.out.println("Yes");
        // Block 7:
        } else {
            System.out.println("No");
        }
        // Block END.
    }
    }

