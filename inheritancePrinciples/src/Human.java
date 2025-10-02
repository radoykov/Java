public class Human {
    protected String firstName;
    protected String lastName;

    public Human() {
        firstName = "None";
        lastName = "None";
    }

    public Human(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setFirstName(String name) {
        if (!name.isEmpty()) {
            this.firstName = name;
        }
    }

    private void setLastName(String name) {
        if (!name.isEmpty()) {
            this.lastName = name;
        }
    }
}