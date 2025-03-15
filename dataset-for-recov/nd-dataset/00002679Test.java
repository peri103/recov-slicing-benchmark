import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        System.out.println("YNEOS"[isSortedNotEqual("4 9 0 8", "   1479") ? 0 : 1]);
        // Block END.
    }

    private static boolean isSortedNotEqual(String str1, String str2) {
        char[] arr1 = str1.replace(" ", "").toCharArray();
        char[] arr2 = str2.replace(" ", "").toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return !Arrays.equals(arr1, arr2);
    }
    }

