public class Person {

    private String name;
    private String surname;
    private int ticket;
    private String gender;

    public Person(String name, String surname, String gender, int ticket) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.ticket = ticket;
    }

    public int getTicket() {
        return ticket;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }
}
