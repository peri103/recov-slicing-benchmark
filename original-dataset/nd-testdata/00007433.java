class Main {
    public static void main(String[] args) {
        // Block 1:
        int h = 210, n = 5;
        // Block 2:
        int[] a = {31, 41, 59, 26, 53};
        // Block 3:
        java.util.Arrays.sort(a);
        // Block 4:
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        for (int v : a) {
            // Block 5:
            h -= v;
            // Block 6:
            if (h <= 0) {
                // Block 7:
                System.out.println("Yes");
                // Block 8:
                break;
            }
        }
        // Block 9:
        else {
            // Block 10:
            System.out.println("No");
        }
        // Block END.
    }
}
