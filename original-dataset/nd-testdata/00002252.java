class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 10, A = 7, B = 5;
        // Block 2:
        System.out.println(Math.min(A, B) + " " + (Math.min(A, B) - N + Math.max(A, B) < 0 ? 0 : Math.min(A, B) - N + Math.max(A, B)));
        // Block END.
    }
}
