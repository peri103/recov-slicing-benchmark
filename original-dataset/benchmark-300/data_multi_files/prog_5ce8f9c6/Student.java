public class Student {
    private String name;
    private DataStorage storage = new DataStorage();

    public Student(String name) {
        this.name = name;
    }

    public void storeGrade(int grade) {
        storage.storeData(grade);
    }

    public Vector getGrades() {
        return storage.getData();
    }
}
