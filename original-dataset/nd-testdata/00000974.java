class Main {
    public static void main(String[] args) {
        // Block 1:
        String n = "111";
        // Block 2:
        if (Integer.parseInt(n) <= Integer.parseInt(n.charAt(0) + "" + n.charAt(0) + "" + n.charAt(0))) {
            // Block 3:
            System.out.println(Integer.parseInt(n.charAt(0) + "" + n.charAt(0) + "" + n.charAt(0)));
        // Block 4:
        } else {
            // Block 5:
            System.out.println(Integer.parseInt((Integer.parseInt(n.charAt(0) + "") + 1) + "" + (Integer.parseInt(n.charAt(0) + "") + 1) + "" + (Integer.parseInt(n.charAt(0) + "") + 1)));
        }
        // Block END.
    }
}
