class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 10, a = 3, b = 5;
        // Block 2:
        int maxi = Math.min(a, b);
        // Block 3:
        int mini = a + b - n;
        // Block 4:
        if (a + b - n <= 0) {
            // Block 5:
            mini = 0;
        }
        // Block 6:
        System.out.println(maxi + " " + mini);
        // Block END.
    }
}
