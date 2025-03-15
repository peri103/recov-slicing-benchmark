import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String n = "10"; 
        String A = "7"; 
        String B = "5";
        // Block 2:
        n = Integer.toString(Integer.parseInt(n));
        // Block 3:
        int a = Integer.parseInt(A);
        // Block 4:
        int b = Integer.parseInt(B);
        // Block 5:
        System.out.println(Math.min(a, b) + " " + Math.max(b - (Integer.parseInt(n) - a), 0));
        // Block END.
    }
    }

