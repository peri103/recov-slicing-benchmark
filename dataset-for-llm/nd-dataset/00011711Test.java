import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        System.out.println(java.util.Map.of("SU", 7, "MO", 6, "TU", 5, "WE", 4, "TH", 3, "FR", 2, "SA", 1).get("SUN".substring(0, 2)));
        // Block END.
    }
    }
}
