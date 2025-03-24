public class UserProfile {
    private String name;
    private DataStore dataStore = new DataStore();

    public UserProfile(String name) {
        this.name = name;
    }

    public void setProfileData(int key, String value) {
        dataStore.storeData(key, value);
    }

    public String getProfileData(int key) {
        return dataStore.retrieveData(key);
    }
}
