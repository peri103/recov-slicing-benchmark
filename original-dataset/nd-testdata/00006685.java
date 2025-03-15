class Main {
    public static void main(String[] args) {
        // Block 1:
        int H = 210, M = 5;
        // Block 2:
        int[] A = {31, 41, 59, 26, 53};
        // Block 3:
        int a = 0;
        for (int num : A) {
            a += num;
        }
        // Block 4:
        String ans;
        if (a >= H) {
            // Block 5:
            ans = "Yes";
        // Block 6:
        } else {
            // Block 7:
            ans = "No";
        }
        // Block 8:
        System.out.println(ans);
        // Block END.
    }
}
