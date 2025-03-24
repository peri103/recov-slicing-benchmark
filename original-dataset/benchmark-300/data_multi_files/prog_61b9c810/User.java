public class User {
    private String name;
    private DataStorage dataStorage = new DataStorage();

    public User(String name) {
        this.name = name;
    }

    public void storeData(String data) {
        dataStorage.storeData(data);
    }

    public boolean checkData(String data) {
        return dataStorage.containsData(data);
    }
}
