import java.util.Arrays;
import org.junit.jupiter.api.Test;

class _00010824Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] s = {'a', 'k', 'a', 's', 'a', 'k', 'a'};
        // Block 2:
        boolean f1 = Arrays.equals(s, reverse(s));
        // Block 3:
        boolean f2 = Arrays.equals(Arrays.copyOfRange(s, 0, (s.length - 1) / 2), reverse(Arrays.copyOfRange(s, 0, (s.length - 1) / 2)));
        // Block 4:
        boolean f3 = Arrays.equals(Arrays.copyOfRange(s, (s.length + 2) / 2, s.length), reverse(Arrays.copyOfRange(s, (s.length + 2) / 2, s.length)));
        // Block 5:
        System.out.println((f1 && f2 && f3) ? "Yes" : "No");
        // Block END.
    }

    public static char[] reverse(char[] array) {
        char[] reversed = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
    }

