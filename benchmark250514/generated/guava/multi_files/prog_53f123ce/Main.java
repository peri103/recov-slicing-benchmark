import com.google.common.collect.LinkedListMultimap;

public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student student1 = new Student("Alice", mathCourse);
        
        mathCourse.addGrade(student1.getName(), 95);

        Student student2 = new Student("Bob", mathCourse);
        mathCourse.addGrade(student2.getName(), 85);

        LinkedListMultimap<String, Integer> grades = student1.getCourse().getGrades();
        /* read */ Integer aliceGrade = grades.get(student1.getName()).iterator().next();
        System.out.println(student1.getName() + "'s grade in " + mathCourse.getCourseName() + ": " + aliceGrade);
    }
}