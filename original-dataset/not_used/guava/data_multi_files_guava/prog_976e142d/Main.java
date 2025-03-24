public class Main {
    public static void main(String[] args) {
        RangeSetManager rangeSetManager = new RangeSetManager();
        rangeSetManager.addRange(1, 5);
        
        Student student = new Student("Alice");
        student.addScore(95);
        
        Course course = new Course("Mathematics");
        course.addStudent(student);
        
        // Check if the range set contains a specific value
        boolean containsValue = rangeSetManager.containsValue(3);
        System.out.println("RangeSet contains 3: " + containsValue);
        
        // Read the score of the student
        /* read */ int score = student.getScores().get(0);
        System.out.println("Student " + student.name + " scored: " + score);
    }
}