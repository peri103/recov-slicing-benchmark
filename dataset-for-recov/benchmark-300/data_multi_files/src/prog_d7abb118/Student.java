public class Student {
    private String name;
    private DataStorage dataStorage = new DataStorage();

    public Student(String name) {
        this.name = name;
    }

    public void storeData(String data) {
        dataStorage.storeData(data);
    }

    public boolean checkData(String data) {
        return dataStorage.checkData(data);
    }
}
