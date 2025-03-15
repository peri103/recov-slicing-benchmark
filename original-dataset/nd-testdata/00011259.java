class Main {
    public static void main(String[] args) {
        // Block 1:
        int SUN_N = 0;
        // Block 2:
        int MON_N = 1;
        // Block 3:
        int TUE_N = 2;
        // Block 4:
        int WED_N = 3;
        // Block 5:
        int THU_N = 4;
        // Block 6:
        int FRI_N = 5;
        // Block 7:
        int SAT_N = 6;
        // Block 8:
        String S = "SUN";
        // Block 9:
        int From_days;
        if (S.equals("SUN")) {
            // Block 10:
            From_days = SUN_N;
        // Block 11:
        } else if (S.equals("MON")) {
            // Block 12:
            From_days = MON_N;
        // Block 13:
        } else if (S.equals("TUE")) {
            // Block 14:
            From_days = TUE_N;
        // Block 15:
        } else if (S.equals("WED")) {
            // Block 16:
            From_days = WED_N;
        // Block 17:
        } else if (S.equals("THU")) {
            // Block 18:
            From_days = THU_N;
        // Block 19:
        } else if (S.equals("FRI")) {
            // Block 20:
            From_days = FRI_N;
        // Block 21:
        } else if (S.equals("SAT")) {
            // Block 22:
            From_days = SAT_N;
        // Block 23:
        } else {
            // Block 24:
            From_days = -99;
        }
        // Block 25:
        int To_days = 7 - From_days;
        // Block 26:
        System.out.println(To_days);
        // Block END.
    }
}
