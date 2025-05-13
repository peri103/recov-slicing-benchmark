import org.apache.commons.collections4.map.ReferenceMap;

public class Course {
    private ReferenceMap<String, String> referenceMap = new ReferenceMap<>();

    public void addStudent(String studentId, String studentName) {
        /* write */ referenceMap.put(studentId, studentName);
    }

    public String getStudentName(String studentId) {
        return referenceMap.get(studentId);
    }
}
