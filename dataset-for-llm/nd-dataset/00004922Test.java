import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] letter = {'s', 'm', 'i', 'l', 'e', 's'};
        // Block 2:
        String ans = letter[0] + Integer.toString(letter.length - 2) + letter[letter.length - 1];
        // Block 3:
        System.out.println(ans);
        // Block END.
    }
    }
}
