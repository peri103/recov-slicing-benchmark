class Main {
    public static void main(String[] args) {
        // Block 1:
        int a = 64146, b = 123, c = 456;
        // Block 2:
        int m = a % (b + c);
        // Block 3:
        int ans = a / (b + c);
        // Block 4:
        if (m >= c) {
            // Block 5:
            System.out.println(ans);
        }
        // Block 6:
        else {
            // Block 7:
            System.out.println(ans - 1);
        }
        // Block END.
    }
}
