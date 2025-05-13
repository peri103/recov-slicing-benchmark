import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        mathCourse.addScore("Alice", 95);
        mathCourse.addScore("Bob", 88);

        Student student1 = new Student("Alice", 20, mathCourse);
        Student student2 = new Student("Bob", 22, mathCourse);

        System.out.println("Student: " + student1.getName() + ", Age: " + student1.getAge() + ", Course: " + student1.getCourse().getCourseName());
        System.out.println("Student: " + student2.getName() + ", Age: " + student2.getAge() + ", Course: " + student2.getCourse().getCourseName());

        HashSetValuedHashMap<String, Integer> scores = mathCourse.getScores();
        /* read */ Integer aliceScore = scores.get("Alice").iterator().next();
        System.out.println("Alice's score in " + mathCourse.getCourseName() + ": " + aliceScore);

        // Additional logic
        int totalScore = 0;
        for (Integer score : scores.get("Bob")) {
            totalScore += score;
        }
        System.out.println("Bob's total score in " + mathCourse.getCourseName() + ": " + totalScore);
    }
}