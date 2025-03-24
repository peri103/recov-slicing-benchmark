public class Student {
    private String name;
    private DataManager dataManager = new DataManager();

    public Student(String name) {
        this.name = name;
    }

    public void addStudentData(int key, String value) {
        dataManager.addData(key, value);
    }

    public String getStudentData(int key) {
        return dataManager.getData(key);
    }
}
