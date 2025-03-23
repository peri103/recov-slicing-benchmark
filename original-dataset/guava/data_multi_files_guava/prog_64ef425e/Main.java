import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        RangeSetBuilder rangeSetBuilder = new RangeSetBuilder();
        rangeSetBuilder.buildRangeSet();
        
        HashMap<String, Student> students = new HashMap<>();
        students.put("Alice", new Student("Alice"));
        students.put("Bob", new Student("Bob"));
        
        students.get("Alice").addScore(90);
        students.get("Bob").addScore(85);
        
        // Displaying student scores
        for (String key : students.keySet()) {
            Student student = students.get(key);
            System.out.println("Student: " + student.getName() + ", Scores: " + student.getScores());
        }
        
        /* read */ boolean containsValue = rangeSetBuilder.getRangeSet().contains(3);
        System.out.println("Does the range set contain 3? " + containsValue);
    }
}