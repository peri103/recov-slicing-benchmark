import org.junit.jupiter.api.Test;

class _00012691Test {
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

