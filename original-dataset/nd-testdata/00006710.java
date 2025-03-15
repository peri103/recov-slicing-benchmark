class Main {
    public static void main(String[] args) {
        // Block 1:
        int H = 211, N = 5;
        // Block 2:
        int[] A = {31, 41, 59, 26, 53};
        // Block 3:
        System.out.println(H <= sum(A) ? "Yes" : "No");
        // Block END.
    }

    private static int sum(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }
}
