class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "smiles";
        // Block 2:
        String answer = "";
        // Block 3:
        char[] sArray = s.toCharArray();
        // Block 4:
        answer = sArray[0] + String.valueOf(sArray.length - 2) + sArray[sArray.length - 1];
        // Block 5:
        System.out.println(answer);
        // Block END.
    }
}
