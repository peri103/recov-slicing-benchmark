public class Student {
    private String name;
    private DataStorage dataStorage = new DataStorage();

    public Student(String name) {
        this.name = name;
    }

    public void storeGrade(int grade) {
        dataStorage.storeData(grade);
    }

    public HashSet<Integer> getGrades() {
        return dataStorage.getDataSet();
    }
}
