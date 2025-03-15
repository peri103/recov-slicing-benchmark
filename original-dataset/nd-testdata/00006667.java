import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // Block 1:
        int H = 10, N = 3;
        // Block 2:
        int[] A_ls = Arrays.stream("4 5 6".split(" ")).mapToInt(Integer::parseInt).toArray();
        // Block 3:
        if (Arrays.stream(A_ls).sum() >= H) {
            // Block 4:
            System.out.println("Yes");
        // Block 5:
        } else {
            // Block 6:
            System.out.println("No");
        }
        // Block END.
    }
}
