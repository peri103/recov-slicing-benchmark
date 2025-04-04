class Main {
    public static void main(String[] args) {
        // Block 1:
        int h = 210, n = 5;
        // Block 2:
        int[] a = {31, 41, 59, 26, 53};
        // Block 3:
        System.out.println((sum(a) < h) ? "No" : "Yes");
        // Block END.
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }
}
