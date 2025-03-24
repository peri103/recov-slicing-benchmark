public class Student {
    private String name;
    private DataManager dataManager = new DataManager();

    public Student(String name) {
        this.name = name;
    }

    public void addStudentData(int key, String value) {
        dataManager.addData(key, value);
    }

    public SortedMap<Integer, String> getStudentData() {
        return dataManager.getDataMap();
    }
}
