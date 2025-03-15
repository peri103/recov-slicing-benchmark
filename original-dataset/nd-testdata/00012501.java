import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        // Block 1:
        int A = 8, B = 12, K = 2;
        // Block 2:
        List<Integer> A_yaku = new ArrayList<>();
        // Block 3:
        List<Integer> B_yaku = new ArrayList<>();
        // Block 4:
        for (int i = 1; i <= A; i++) {
            // Block 5:
            if (A % i == 0) {
                // Block 6:
                A_yaku.add(i);
            }
        }
        // Block 7:
        for (int j = 1; j <= B; j++) {
            // Block 8:
            if (B % j == 0) {
                // Block 9:
                B_yaku.add(j);
            }
        }
        // Block 10:
        HashSet<Integer> A_B_and_set = new HashSet<>(A_yaku);
        A_B_and_set.retainAll(B_yaku);
        // Block 11:
        List<Integer> A_B_and_list = new ArrayList<>(A_B_and_set);
        // Block 12:
        Collections.sort(A_B_and_list, Collections.reverseOrder());
        // Block 13:
        int ans = A_B_and_list.get(K - 1);
        // Block 14:
        System.out.println(ans);
        // Block END.
    }
}
