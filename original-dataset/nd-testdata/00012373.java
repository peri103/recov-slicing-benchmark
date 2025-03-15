class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "akasaka";
        // Block 2:
        char[] sArray = s.toCharArray();
        // Block 3:
        String s1 = new String(sArray, 0, sArray.length / 2);
        // Block 4:
        String s2 = new String(sArray, sArray.length / 2 + 1, sArray.length - (sArray.length / 2 + 1));
        // Block 5:
        if (s1.equals(s2)) {
            // Block 6:
            System.out.println("Yes");
        // Block 7:
        } else {    
            // Block 8:
            System.out.println("No");
        }
        // Block END.
    }
}
