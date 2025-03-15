class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 6;
        // Block 2:
        int[] gre = {3, 5, 7};
        // Block 3:
        boolean found = false;
        for (int i = 0; i < gre.length; i++) {
            if (N == gre[i]) {
                found = true;
                break;
            }
        }
        if (found) {
            // Block 4:
            System.out.println("YES");
        } else {
            // Block 5:
            System.out.println("NO");
        }
        // Block END.
    }
}
