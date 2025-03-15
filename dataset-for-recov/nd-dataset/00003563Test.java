import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int house_len = 20, curtain_len = 15;
        // Block 2:
        if (house_len >= curtain_len * 2) {
            // Block 3:
            System.out.println(house_len - curtain_len * 2);
        }
        // Block 4:
        else {
            // Block 5:
            System.out.println(0);
        }
        // Block END.
    }
    }
}
