public class Main {
    public static void main(String[] args) {
        // Create a new School instance
        School school = new School();
        
        // Add scores for students in different subjects
        school.addScore("Alice", "Math", 95);
        school.addScore("Bob", "Science", 85);
        
        // Create a new Student instance
        Student student = new Student("Alice");
        student.addCourseScore("History", 88);
        student.addCourseScore("Math", 90);
        
        // Retrieve and print the score from the School
        Integer mathScore = school.getScore("Alice", "Math");
        System.out.println("Alice's Math score from School: " + mathScore);
        
        // Retrieve and print the score from the Student
        Integer historyScore = student.getCourseScore("History");
        System.out.println("Alice's History score from Student: " + historyScore);
        
        // Retrieve and print all scores for the student
        Table<String, String, Integer> allScores = student.getAllCourseScores();
        for (Table.Cell<String, String, Integer> cell : allScores.cellSet()) {
            System.out.println("Course: " + cell.getColumnKey() + ", Score: " + cell.getValue());
        }
        
        // Use the read method to get the value from the School
        /* read */ Integer retrievedScore = school.getScore("Alice", "Math");
        
        // Print the retrieved score
        System.out.println("Retrieved Math score from School: " + retrievedScore);
    }
}