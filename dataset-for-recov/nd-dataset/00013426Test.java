import org.junit.jupiter.api.Test;

class _00013426Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "abcde,fghihgf,edcba";
        // Block 2:
        String a = s.substring(0, 5);
        // Block 3:
        String b = s.substring(6, 13);
        // Block 4:
        String c = s.substring(14);
        // Block 5:
        System.out.println(a + " " + b + " " + c);
        // Block END.
    }
    }

