import org.junit.jupiter.api.Test;

class _00017110Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        java.util.Map<String, String> dic = new java.util.HashMap<>();
        dic.put("H,H", "H");
        dic.put("H,D", "D");
        dic.put("D,D", "H");
        dic.put("D,H", "D");
        // Block 2:
        String a = "D"; String b = "H";
        // Block 3:
        System.out.println(dic.get(a + "," + b));
        // Block END.
    }
    }

