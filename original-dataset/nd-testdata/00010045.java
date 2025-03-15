class Main {
    public static void main(String[] args) {
        // Block 1:
        String n = "3";
        // Block 2:
        String s = "())";
        // Block 3:
        String ss = s;
        // Block 4:
        for (int i = 0; i < 50; i++) {
            // Block 5:
            s = s.replace("()", "");
        }
        // Block 6:
        int l = s.length() - s.replace(")", "").length();
        // Block 7:
        int r = s.length() - s.replace("(", "").length();
        // Block 8:
        System.out.print("("repeat(l) + ss + ")"repeat(r));
        // Block END.
    }

    private static String repeat(int n) {
        return new String(new char[n]).replace("\u0000", "(");
    }
}
