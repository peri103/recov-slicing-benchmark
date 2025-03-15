import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h_1 = 10, m_1 = 0, h_2 = 15, m_2 = 0, k = 30;
        // Block 2:
        if (m_2 - k >= 0) {
            // Block 3:
            m_2 -= k;
        }
        // Block 4:
        else {
            // Block 5:
            int tmp = k - m_2;
            // Block 6:
            m_2 = 60 - tmp;
            // Block 7:
            h_2 -= 1;
        }
        // Block 8:
        int tmp_1 = h_1 * 60 + m_1;
        // Block 9:
        int tmp_2 = h_2 * 60 + m_2;
        // Block 10:
        int ans = tmp_2 - tmp_1;
        // Block 11:
        System.out.println(ans);
        // Block END.
    }
    }
}
