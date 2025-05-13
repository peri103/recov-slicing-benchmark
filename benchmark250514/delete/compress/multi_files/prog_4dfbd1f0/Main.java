import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.FlushMode;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            CompressorManager compressorManager = new CompressorManager();

            Student student = new Student("John");
            student.addScore(85);
            student.addScore(92);

            HashMap<String, Integer> map = new HashMap<>();
            map.put("Math", 90);
            map.put("Science", 95);

            int total = 0;
            for (Integer score : student.getScores()) {
                total += score;
            }

            for (Integer value : map.values()) {
                total += value;
            }

            System.out.println("Total Score: " + total);

            compressorManager.setFlushMode(FlushMode.SYNC_FLUSH);

            FlushMode mode = compressorManager.getFlushMode();
            /* read */ System.out.println("Flush Mode: " + mode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}