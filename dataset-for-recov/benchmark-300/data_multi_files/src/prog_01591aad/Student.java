public class Student {
    private String name;
    private int age;
    private DataManager dataManager = new DataManager();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void storeGrade(String subject, int grade) {
        dataManager.storeData(subject, grade);
    }

    public Integer getGrade(String subject) {
        return dataManager.retrieveData(subject);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
