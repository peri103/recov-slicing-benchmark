class Main {
    public static void main(String[] args) {
        // Block 1:
        String n = "111";
        // Block 2:
        int memo = Integer.parseInt(n.charAt(0) + "" + n.charAt(0) + "" + n.charAt(0));
        // Block 3:
        if (Integer.parseInt(n) <= memo) {
            // Block 4:
            System.out.println(memo);
        }
        // Block 5:
        else {
            // Block 6:
            System.out.println(memo + 111);
        }
        // Block END.
    }
}
