class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 10, A = 7, B = 5;
        // Block 2:
        int max_ans = Math.min(A, B);
        // Block 3:
        int tmp = A + B - N;
        // Block 4:
        int min_ans = (tmp <= 0) ? 0 : tmp;
        // Block 5:
        System.out.println(max_ans + " " + min_ans);
        // Block END.
    }
}
