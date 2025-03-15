class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 1, P = 1;
        // Block 2:
        int[] a = {50};
        // Block 3:
        int num_odd = 0;
        for (int i : a) {
            if (i % 2 == 1) {
                num_odd++;
            }
        }
        // Block 4:
        int num_even = N - num_odd;
        // Block 5:
        int ce = (int) Math.pow(2, num_even);
        // Block 6:
        int co = (int) Math.pow(2, num_odd - 1);
        // Block 7:
        if (num_odd == 0) {
            // Block 8:
            co = P ^ 1;
        }
        // Block 9:
        System.out.println(co * ce);
        // Block END.
    }
}
