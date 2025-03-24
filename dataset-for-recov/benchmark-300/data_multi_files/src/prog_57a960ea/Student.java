public class Student {
    private String name;
    private DataStorage dataStorage = new DataStorage();

    public Student(String name) {
        this.name = name;
    }

    public void storeData(String data) {
        dataStorage.storeData(data);
    }

    public String retrieveData() {
        return dataStorage.retrieveData();
    }
}
