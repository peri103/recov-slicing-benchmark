import org.apache.commons.lang3.text.StrBuilder;

public class Student {
    private String name;
    private StrBuilder notes = new StrBuilder();

    public Student(String name) {
        this.name = name;
    }

    public void addNote(String note) {
        notes.append(note).append(" ");
    }

    public void removeCharacterFromNotes(int index) {
        /* write */ notes.deleteCharAt(index);
    }

    public String getNotes() {
        /* read */ return notes.toString();
    }

    public String getName() {
        return name;
    }
}
