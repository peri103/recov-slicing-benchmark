import java.util.List;

public class Main {
    public static void main(String[] args) {
        ImmutableMapExample mapExample = new ImmutableMapExample();
        mapExample.addEntry("key1", 100);
        ImmutableMap<String, Integer> immutableMap = mapExample.buildMap();

        Student student = new Student("Alice");
        student.addScore(95);
        student.addScore(85);
        
        /* read */ int value = immutableMap.get("key1");
        System.out.println(value);

        List<Integer> scores = student.getScores();
        for (Integer score : scores) {
            System.out.println("Score: " + score);
        }
    }
}