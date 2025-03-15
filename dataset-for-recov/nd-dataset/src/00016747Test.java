import org.junit.jupiter.api.Test;

class _00016747Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] i_list = {'D', 'H'};
        // Block 2:
        char a = i_list[0];
        // Block 3:
        char b = i_list[1];
        // Block 4:
        char r = ' ';
        // Block 5:
        if (a == 'H') {
            // Block 6:
            r = b;
        }
        // Block 7:
        else {
            // Block 8:
            r = (b == 'D') ? 'H' : 'D';
        }
        // Block 9:
        System.out.println(r);
        // Block END.
    }
    }

