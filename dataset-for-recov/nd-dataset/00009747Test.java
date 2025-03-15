import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 8;
        // Block 2:
        String s = "))))(((";
        // Block 3:
        int[] data = {0, 0};  
        // Block 4:
        int temp = -1;
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            temp += 1;
            // Block 7:
            char tar = s.charAt(temp);
            // Block 8:
            if (tar == '(') {
                // Block 9:
                data[0] += 1;
            }
            // Block 10:
            else {
                // Block 11:
                if (data[0] > data[1]) {
                    // Block 12:
                    data[0] -= 1;
                }
                // Block 13:
                else {
                    // Block 14:
                    s = '(' + s;
                    // Block 15:
                    temp += 1;
                }
            }
        }
        // Block 16:
        String add = new String(new char[data[0]]).replace("\0", ")");
        // Block 17:
        s = s + add;
        // Block 18:
        System.out.println(s);
        // Block END.
    }
    }

