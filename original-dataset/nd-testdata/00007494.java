class Main {
    public static void main(String[] args) {
        // Block 1:
        int h = 20, n = 3;
        // Block 2:
        int[] xlist = {4, 5, 6};
        // Block 3:
        int sum = 0;
        for (int num : xlist) {
            sum += num;
        }
        if (sum >= h) {
            // Block 4:
            System.out.println("Yes");
        } else {
            // Block 5:
            System.out.println("No");
        }
        // Block END.
    }
}
