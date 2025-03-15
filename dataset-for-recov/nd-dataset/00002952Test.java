import org.junit.jupiter.api.Test;

class _00002952Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "1234567876";
        // Block 2:
        int la = a.length();
        // Block 3:
        int res = 753;
        // Block 4:
        for (int i = 0; i < la - 2; i++) {
            // Block 5:
            String temp = a.substring(i, i + 3);
            // Block 6:
            int tempp = Math.abs(Integer.parseInt(temp) - 753);
            // Block 7:
            res = Math.min(res, tempp);
        }
        // Block 8:
        System.out.println(res);
        // Block END.
    }
    }

