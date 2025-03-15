class Main {
    public static void main(String[] args) {
        // Block 1:
        int H = 210, N = 5;
        // Block 2:
        String[] input = "31 41 59 26 53".split(" ");
        int[] A_list = new int[N];
        for (int i = 0; i < N; i++) {
            A_list[i] = Integer.parseInt(input[i]);
        }
        // Block 3:
        String ans = (sum(A_list) >= H) ? "Yes" : "No";
        // Block 4:
        System.out.println(ans);
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
