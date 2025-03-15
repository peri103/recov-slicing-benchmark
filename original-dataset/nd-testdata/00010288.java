class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 8;
        // Block 2:
        String s = "))))((((";
        // Block 3:
        String s_ = s;
        // Block 4:
        while (countOccurrences(s_, "()") > 0) {
            // Block 5:
            s_ = s_.replace("()", "");
        }
        // Block 6:
        int l = countOccurrences(s_, ")");
        // Block 7:
        int r = s_.length() - l;
        // Block 8:
        String ans = "(" + repeatString("(", l) + s + repeatString(")", r);
        // Block 9:
        System.out.println(ans);
        // Block END.
    }

    private static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    private static String repeatString(String str, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
