import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] letter = {'i', 'n', 't', 'e', 'r', 'n', 'a', 't', 'i', 'o', 'n', 'a', 'l', 'i', 'z', 'a', 't', 'i', 'o', 'n'};
        // Block 2:
        String ans = letter[0] + Integer.toString(letter.length - 2) + letter[letter.length - 1];
        // Block 3:
        System.out.println(ans);
        // Block END.
    }
    }
}
