import org.junit.jupiter.api.Test;

class _00004807Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "internationalization";
        // Block 2:
        int mojisuu = s.length();
        // Block 3:
        int tyuukanmojisuu = s.length() - 2;
        // Block 4:
        char[] s_list = s.toCharArray();
        // Block 5:
        System.out.printf("%c%d%c%n", s_list[0], tyuukanmojisuu, s_list[mojisuu - 1]);
        // Block END.
    }
    }

