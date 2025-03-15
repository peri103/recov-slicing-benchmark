class Main {
    public static void main(String[] args) {
        // Block 1:
        int H = 211, N = 5;
        // Block 2:
        String[] input = "31 41 59 26 53".split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        // Block 3:
        int sum = 0;
        for (int num : A) {
            sum += num;
        }
        System.out.println(H <= sum ? "Yes" : "No");
        // Block END.
    }
}
