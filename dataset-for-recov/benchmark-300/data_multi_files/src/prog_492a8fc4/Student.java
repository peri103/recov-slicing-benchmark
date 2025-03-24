public class Student {
    private String name;
    private DataStorage dataStorage = new DataStorage();

    public Student(String name) {
        this.name = name;
    }

    public void addData(String data) {
        dataStorage.addData(data);
    }

    public boolean checkData(String data) {
        return dataStorage.containsData(data);
    }
}
