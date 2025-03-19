public class DecodeCiphertext {
    public String decodeCiphertext(String et, int rows) {
        int cols = et.length()/rows;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < cols; ++i) {
            for (int j = 0; j < rows && i+j<cols; ++j) {
                ans.append(et.charAt(j*cols+i+j));
            }
        }
        String aa = ans.toString();
        int last = 0;
        for (int i = 0; i < aa.length(); ++i) {
            if (aa.charAt(i)!=' ')
                last = i+1;
        }
        return aa.substring(0,last);
    }
    public static void main(String[] args) {
        DecodeCiphertext decoder = new DecodeCiphertext();
        String encodedText = "ch   ie   pr";
        int rows = 3;
        String decodedText = decoder.decodeCiphertext(encodedText, rows);
        System.out.println("Decoded Text: " + decodedText);
    }
}
