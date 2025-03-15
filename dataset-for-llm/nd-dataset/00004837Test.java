import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] s = {'i', 'n', 't', 'e', 'r', 'n', 'a', 't', 'i', 'o', 'n', 'a', 'l', 'i', 'z', 'a', 't', 'i', 'o', 'n'};
        // Block 2:
        int len_s = s.length;
        // Block 3:
        String ans = s[0] + Integer.toString(len_s - 2) + s[len_s - 1];
        // Block 4:
        System.out.println(ans);
        // Block END.
    }
    }
}
