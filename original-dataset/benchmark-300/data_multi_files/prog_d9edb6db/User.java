public class User {
    private String name;
    private DataStorage dataStorage = new DataStorage();

    public User(String name) {
        this.name = name;
    }

    public void storeData(int value) {
        dataStorage.storeData(value);
    }

    public boolean checkData(int value) {
        return dataStorage.checkData(value);
    }
}
