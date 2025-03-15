class Main {
    public static void main(String[] args) {
        // Block 1:
        String x = "6";
        // Block 2:
        String[] lst = {'7', '5', '3'};
        // Block 3:
        boolean found = false;
        for (String num : lst) {
            if (num.equals(x)) {
                found = true;
                break;
            }
        }
        if (found) {
            // Block 4:
            System.out.println("YES");
        // Block 5:
        } else {
            // Block 6:
            System.out.println("NO");
        }
        // Block END.
    }
}
