class Main {
    public static void main(String[] args) {
        // Block 1:
        int H = 211, N = 5;
        // Block 2:
        int[] A = {31, 41, 59, 26, 53};
        // Block 3:
        int rest_H = H - java.util.Arrays.stream(A).sum();
        // Block 4:
        if (rest_H <= 0) {
            // Block 5:
            System.out.println("Yes");
        // Block 6:
        } else {
            // Block 7:
            System.out.println("No");
        }
        // Block END.
    }
}
