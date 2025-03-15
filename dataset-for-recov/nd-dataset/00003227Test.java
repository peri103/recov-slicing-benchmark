import org.junit.jupiter.api.Test;

class _00003227Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String A = "20"; 
        String B = "30";
        // Block 2:
        A = Integer.parseInt(A);
        // Block 3:
        B = Integer.parseInt(B);
        // Block 4:
        int ans = Math.max(0, A - 2 * B);
        // Block 5:
        System.out.println(ans);
        // Block END.
    }
    }

