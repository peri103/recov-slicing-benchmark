class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 100, A = 100, B = 100;
        // Block 2:
        int ans1 = Math.min(A, B), ans2 = Math.max(0, A + B - N);
        // Block 3:
        System.out.println(ans1 + " " + ans2);
        // Block END.
    }
}
