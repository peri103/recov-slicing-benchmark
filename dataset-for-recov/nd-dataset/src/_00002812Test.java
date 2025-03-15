import org.junit.jupiter.api.Test;

class _00002812Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String n = "1234567876";
        // Block 2:
        int count = 1000;
        // Block 3:
        for (int i = 0; i < n.length() - 2; i++) {
            // Block 4:
            count = Math.min(count, Math.abs(753 - Integer.parseInt(n.substring(i, i + 3))));
        }
        // Block 5:
        System.out.println(count);
        // Block END.
    }
    }

