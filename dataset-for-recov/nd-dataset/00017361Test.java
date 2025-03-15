import org.junit.jupiter.api.Test;

class _00017361Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "H"; String b = "H";
        // Block 2:
        java.util.Map<String, String> t = new java.util.HashMap<>();
        t.put("HH", "H");
        t.put("HD", "D");
        t.put("DH", "D");
        t.put("DD", "H");
        // Block 3:
        System.out.println(t.get(a + b));
        // Block END.
    }
    }

