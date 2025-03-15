class Main {
    public static void main(String[] args) {
        // Block 1:
        String a = "20"; 
        String b = "30";
        // Block 2:
        a = Integer.parseInt(a);
        // Block 3:
        b = Integer.parseInt(b);
        // Block 4:
        int ret = a - (b * 2);
        // Block 5:
        if (ret < 0) {
            // Block 6:
            ret = 0;
        }
        // Block 7:
        System.out.println(ret);
        // Block END.
    }
}
