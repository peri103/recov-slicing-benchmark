class Main {
    public static void main(String[] args) {
        // Block 1:
        int X = 5;
        // Block 2:
        int[] Cel = {3, 5, 7};
        // Block 3:
        boolean found = false;
        for (int c : Cel) {
            if (c == X) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("YES");
        // Block 4:
        } else {
            System.out.println("NO");
        }
        // Block END.
    }
}
