class Main {
    public static void main(String[] args) {
        // Block 1:
        int x = 6;
        // Block 2:
        int[] li = {3, 5, 7};
        // Block 3:
        boolean found = false;
        for (int num : li) {
            if (num == x) {
                // Block 4:
                System.out.println("YES");
                found = true;
                break;
            }
        }
        // Block 5:
        if (!found) {
            // Block 6:
            System.out.println("NO");
        }
        // Block END.
    }
}
