import org.junit.jupiter.api.Test;

class _00004586Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "smiles";
        // Block 2:
        int l = s.length();
        // Block 3:
        String front = String.valueOf(s.charAt(0));
        // Block 4:
        String back = String.valueOf(s.charAt(l - 1));
        // Block 5:
        String center = String.valueOf(l - 2);
        // Block 6:
        String ans = front + center + back;
        // Block 7:
        System.out.println(ans);
        // Block END.
    }
    }

