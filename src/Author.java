public class Author {
    private finalString firstName;
    private  finalString lastName;

    public Author( StringfirstName , StringlastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public String toString() {
        return "Имя " + this.firstName + " Фамилия " + this.lastName;
    }

}
