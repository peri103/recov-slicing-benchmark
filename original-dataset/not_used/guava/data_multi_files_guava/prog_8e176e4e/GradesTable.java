import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class GradesTable {
    private Table<String, String, Integer> table = HashBasedTable.create();

    public void addGrade(String studentName, String courseName, Integer grade) {
        /* write */ table.put(studentName, courseName, grade);
    }

    public Integer getGrade(String studentName, String courseName) {
        return table.get(studentName, courseName);
    }
}
