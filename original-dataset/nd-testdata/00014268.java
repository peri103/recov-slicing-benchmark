class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 7;
        // Block 2:
        int[] A = {1, 2, 3, 2, 1, 999999999, 1000000000};
        // Block 3:
        boolean increase = true;
        // Block 4:
        boolean equal = true;
        // Block 5:
        boolean start = true;
        // Block 6:
        int count = 1;
        // Block 7:
        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            // Block 8:
            if (i > 0) {
                // Block 9:
                if (equal) {
                    // Block 10:
                    if (a > A[i - 1]) {
                        // Block 11:
                        increase = true;
                        // Block 12:
                        equal = false;
                    // Block 13:
                    } else if (a < A[i - 1]) {
                        // Block 14:
                        increase = false;
                        // Block 15:
                        equal = false;
                    }
                // Block 16:
                } else {
                    // Block 17:
                    if (increase) {
                        // Block 18:
                        if (a < A[i - 1]) {
                            // Block 19:
                            count += 1;
                            // Block 20:
                            equal = true;
                        }
                    // Block 21:
                    } else {
                        // Block 22:
                        if (a > A[i - 1]) {
                            // Block 23:
                            count += 1;
                            // Block 24:
                            equal = true;
                            // Block 25:
                            start = true;
                        }
                    }
                }
            }
        }
        // Block 26:
        System.out.println(count);
        // Block END.
    }
}
