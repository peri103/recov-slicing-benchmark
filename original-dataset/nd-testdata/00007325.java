class Main {
    public static void main(String[] args) {
        // Block 1:
        int H = 10, N = 3;
        // Block 2:
        int[] data = {4, 5, 6};
        // Block 3:
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        // Block 4:
        if (H - sum > 0) {
            // Block 5:
            System.out.println("No");
        // Block 6:
        } else {
            // Block 7:
            System.out.println("Yes");
        }
        // Block END.
    }
}
