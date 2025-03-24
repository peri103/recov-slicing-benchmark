public class User {
    private String name;
    private DataManager dataManager = new DataManager();

    public User(String name) {
        this.name = name;
    }

    public void addData(int value) {
        dataManager.addData(value);
    }

    public boolean checkData(int value) {
        return dataManager.containsData(value);
    }
}
