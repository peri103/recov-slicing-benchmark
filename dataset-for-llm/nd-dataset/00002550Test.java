import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "1 7 9 4";
        System.out.println("YNEOS"[any(x -> !s.contains(String.valueOf(x)), "1479") ? 1 : 0]);
        // Block END.
    }
    }
}
