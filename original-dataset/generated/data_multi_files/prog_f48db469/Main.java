public class Main {
    public static void main(String[] args) {
        CustomSet customSet = new CustomSet();
        Student student = new Student("Bob");

        // Adding elements to the set
        customSet.addElement(10);
        customSet.addElement(20);
        customSet.addElement(30);
        
        // Adding course scores for the student
        student.addCourseScore("Math", 95);
        student.addCourseScore("Science", 88);
        student.addCourseScore("History", 76);

        // Check if the set contains a specific element
        boolean containsValue = customSet.containsElement(20);
        System.out.println("Set contains 20: " + containsValue);

        // Check if the set contains the element added in CustomSet class
        boolean contains42 = customSet.containsElement(42);
        System.out.println("Set contains 42: " + contains42);

        // Display student's scores
        System.out.println("Scores for " + student.getCourseScores());
    }
}