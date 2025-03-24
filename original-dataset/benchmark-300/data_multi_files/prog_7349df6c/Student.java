public class Student {
    private String name;
    private int studentId;
    private DataStorage dataStorage = new DataStorage();

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void storeGrade(String grade) {
        dataStorage.storeData(studentId, grade);
    }

    public String getGrade() {
        return dataStorage.retrieveData(studentId);
    }
}
