import org.junit.jupiter.api.Test;

class _00011410Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "SAT";
        // Block 2:
        String[] l = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        // Block 3:
        int[] d = {7, 6, 5, 4, 3, 2, 1};
        // Block 4:
        System.out.println(d[getIndex(l, s)]);
        // Block END.
    }

    private static int getIndex(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1; // Return -1 if the value is not found
    }
    }

