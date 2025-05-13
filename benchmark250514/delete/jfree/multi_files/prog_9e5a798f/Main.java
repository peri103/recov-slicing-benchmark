import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        ToolTipConfig tooltipConfig = new ToolTipConfig();
        NumberFormat format = NumberFormat.getInstance();
        
        tooltipConfig.configureCategoryFormat(format);
        
        Course mathCourse = new Course("Mathematics");
        mathCourse.addStudentGrade("Alice", 85.5);
        mathCourse.addStudentGrade("Bob", 92.0);
        
        System.out.println("Grades in " + mathCourse.getAllGrades());

        /* read */ NumberFormat readFormat = tooltipConfig.retrieveCategoryFormat();
        System.out.println(readFormat.equals(format)); // This should print true

        double aliceGrade = mathCourse.getStudentGrade("Alice");
        System.out.println("Alice's grade in Mathematics: " + aliceGrade);
    }
}