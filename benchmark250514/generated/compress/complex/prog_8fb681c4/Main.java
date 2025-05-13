import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        /* write */ gzipParams.setComment("This is a test comment.");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            map.put("Number_" + i, numbers.get(i));
        }

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        /* read */ String comment = gzipParams.getComment();
        System.out.println("Gzip Comment: " + comment);

        ArrayList<String> commentsList = new ArrayList<>();
        commentsList.add(comment);
        commentsList.add("Another comment");
        commentsList.add("Yet another comment");

        for (String cmt : commentsList) {
            System.out.println("Comment in list: " + cmt);
        }
    }
}