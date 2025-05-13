public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        
        mathCourse.addStudent("Alice");
        mathCourse.addStudent("Bob");
        
        mathCourse.addGradeRange(0, 50, "Fail");
        mathCourse.addGradeRange(51, 75, "Pass");
        mathCourse.addGradeRange(76, 100, "Excellent");
        
        for (String student : mathCourse.getEnrolledStudents()) {
            System.out.println("Student: " + student);
        }
        
        /* read */ String grade = mathCourse.getGrade(65);
        
        System.out.println("Grade for score 65: " + grade);
        
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i * 10;
        }
        System.out.println("Sum of multiples of 10 from 1 to 5: " + sum);
    }
}