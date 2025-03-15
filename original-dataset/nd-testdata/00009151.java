class Main {
    public static void main(String[] args) {
        // Block 1:
        String S = "2017/01/31";
        // Block 2:
        S = "2018/01/" + S.substring(8, 10);
        // Block 3:
        System.out.println(S);
        // Block END.
    }
}
