import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int[] l = {1, 1, 1, 0, 1, 0, 1, 0, 1, 1};
        // Block 2:
        String result = "YNEOS";
        String output = result.substring(l[Integer.parseInt("6")], result.length()).replaceAll(".", "").replaceAll("(?<=\\G.{2})", "");
        System.out.println(output);
        // Block END.
    }
    }

