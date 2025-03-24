public class Student {
    private String name;
    private DataManager dataManager = new DataManager();

    public Student(String name) {
        this.name = name;
    }

    public void addData(String data) {
        dataManager.addData(data);
    }

    public boolean containsData(String data) {
        return dataManager.containsData(data);
    }
}
