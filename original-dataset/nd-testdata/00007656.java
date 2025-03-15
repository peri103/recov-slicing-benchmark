class Main {
    public static void main(String[] args) {
        // Block 1:
        int h = 211, n = 5;
        // Block 2:
        int[] A = {31, 41, 59, 26, 53};
        // Block 3:
        for (int a : A) {
            // Block 4:
            h -= a;
        }
        // Block 5:
        System.out.println(h <= 0 ? "Yes" : "No");
        // Block END.
    }
}
