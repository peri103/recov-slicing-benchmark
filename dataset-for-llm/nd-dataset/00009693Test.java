import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String n = "6";
        // Block 2:
        String s = ")))())";
        // Block 3:
        String l = "(";
        // Block 4:
        String r = ")";
        // Block 5:
        int add_right = 0, add_left = 0;
        // Block 6:
        for (char c : s.toCharArray()) {
            // Block 7:
            if (c == l.charAt(0)) {
                // Block 8:
                add_right += 1;
            }
            // Block 9:
            else {
                // Block 10:
                if (add_right > 0) {
                    // Block 11:
                    add_right -= 1;
                }
                // Block 12:
                else {
                    // Block 13:
                    add_left += 1;
                }
            }
        }
        // Block 14:
        System.out.println(repeat(l, add_left) + s + repeat(r, add_right));
        // Block END.
    }

    private static String repeat(String str, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
    }
}
