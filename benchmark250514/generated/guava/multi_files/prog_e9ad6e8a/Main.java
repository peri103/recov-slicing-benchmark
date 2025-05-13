import com.google.common.collect.ImmutableBiMap;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        
        Course course = new Course();
        course.addStudentScore(student1.getName(), 85);
        course.addStudentScore(student2.getName(), 92);
        
        ImmutableBiMap<String, Integer> studentScores = course.buildStudentScores();
        
        int totalScore = 0;
        for (String studentName : studentScores.keySet()) {
            totalScore += studentScores.get(studentName);
        }
        
        System.out.println("Total score of all students: " + totalScore);
        
        /* read */ Integer aliceScore = studentScores.get(student1.getName());
        System.out.println("Alice's score: " + aliceScore);
        
        int highestScore = 0;
        String topStudent = "";
        for (String studentName : studentScores.keySet()) {
            int score = studentScores.get(studentName);
            if (score > highestScore) {
                highestScore = score;
                topStudent = studentName;
            }
        }
        
        System.out.println("Top student: " + topStudent + " with score: " + highestScore);
    }
}