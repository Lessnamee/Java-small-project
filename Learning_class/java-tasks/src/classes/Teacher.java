package classes;

public class Teacher extends Person {
    private ScientificTitle scientificTitle;

    public String getName() {
        return super.getName();
    }

    public String getSurname() {
        return super.getSurname();
    }

    public ScientificTitle getScientificTitle() {
        return scientificTitle;
    }

    public Teacher(String name, String surname, ScientificTitle scientificTitle) {
        super(name, surname);
        this.scientificTitle = scientificTitle;
    }

    @Override
    public String toString() {
        return super.toString() +
                "My title is " + getScientificTitle() + ".";
    }
}
