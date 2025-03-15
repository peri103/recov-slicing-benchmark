class Main {
    public static void main(String[] args) {
        // Block 1:
        String x = "750";
        // Block 2:
        if (Integer.parseInt(String.valueOf(x.charAt(0))) > Integer.parseInt(String.valueOf(x.charAt(1)))) {
            // Block 3:
            System.out.println(String.valueOf(x.charAt(0)).repeat(3));
        // Block 4:
        } else if (Integer.parseInt(String.valueOf(x.charAt(0))) == Integer.parseInt(String.valueOf(x.charAt(1)))) {
            // Block 5:
            if (Integer.parseInt(String.valueOf(x.charAt(0))) >= Integer.parseInt(String.valueOf(x.charAt(2)))) {
                // Block 6:
                System.out.println(String.valueOf(x.charAt(0)).repeat(3));
            // Block 7:
            } else {
                // Block 8:
                System.out.println(String.valueOf(Integer.parseInt(String.valueOf(x.charAt(0))) + 1).repeat(3));
            }
        // Block 9:
        } else {
            // Block 10:
            System.out.println(String.valueOf(Integer.parseInt(String.valueOf(x.charAt(0))) + 1).repeat(3));
        }
        // Block END.
    }
}
