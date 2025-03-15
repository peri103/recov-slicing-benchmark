import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String[] input = "211 5".split(" ");
        int h = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int sum = 0;
        String[] numbers = "31 41 59 26 53".split(" ");
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        System.out.println("NYoe s".charAt(h <= sum ? 0 : 1));
        // Block END.
    }
    }

