import java.util.concurrent.ConcurrentSkipListMap;

public class StudentGrades {
    private ConcurrentSkipListMap<Integer, Integer> gradesMap = new ConcurrentSkipListMap<>();

    public void addGrade(int grade) {
        /* write */ gradesMap.put(gradesMap.size() + 1, grade);
    }

    public int getGrade(int key) {
        return gradesMap.get(key);
    }
}
