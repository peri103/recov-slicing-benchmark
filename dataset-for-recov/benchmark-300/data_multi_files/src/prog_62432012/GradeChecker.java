import java.util.SortedSet;

public class GradeChecker {
    public static boolean checkGrade(SortedSet<Integer> grades, int grade) {
        /* read */ return grades.contains(grade);
    }
}
