public class Student {
    private String name;
    private DataStore dataStore = new DataStore();

    public Student(String name) {
        this.name = name;
    }

    public void storeGrade(String subject, int grade) {
        dataStore.storeData(subject, grade);
    }

    public Integer getGrade(String subject) {
        return dataStore.retrieveData(subject);
    }
}
