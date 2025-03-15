class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 1, P = 1;
        // Block 2:
        int[] Alist = {50};
        // Block 3:
        int[] guuki = new int[Alist.length];
        for (int i = 0; i < Alist.length; i++) {
            guuki[i] = Alist[i] % 2;
        }
        // Block 4:
        int odd = 0;
        for (int value : guuki) {
            if (value == 1) {
                odd++;
            }
        }
        // Block 5:
        int even = guuki.length - odd;
        // Block 6:
        if (odd == 0) {
            // Block 7:
            if (P == 0) {
                // Block 8:
                System.out.println((int) Math.pow(2, N));
            }
            // Block 9:
            else {
                // Block 10:
                System.out.println(0);
            }
        }
        // Block 11:
        else {
            // Block 12:
            System.out.println((int) Math.pow(2, N - 1));
        }
        // Block END.
    }
}
