class Main {
    public static void main(String[] args) {
        // Block 1:
        String a = "D"; 
        String b = "H";
        // Block 2:
        if (a.equals("H")) { 
            System.out.println(b.equals("H") ? "H" : "D"); 
        } 
        // Block 3:
        else { 
            System.out.println(b.equals("H") ? "D" : "H"); 
        }
        // Block END.
    }
}
