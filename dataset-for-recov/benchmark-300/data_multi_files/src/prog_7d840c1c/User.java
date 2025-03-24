public class User {
    private String name;
    private DataStore dataStore = new DataStore();

    public User(String name) {
        this.name = name;
    }

    public void addData(int value) {
        dataStore.addData(value);
    }

    public boolean checkData(int value) {
        return dataStore.containsData(value);
    }
}
