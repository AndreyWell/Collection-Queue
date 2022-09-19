import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Deque<Person> line = new LinkedList<>(generateClients());

        while (!line.isEmpty()) {
            Person poll = line.poll();
            if (poll.getTicket() > 0) {
                if (poll.getTicket() > 0)
                    System.out.println(poll.getName() + " " + poll.getSurname() +
                            (poll.getGender().equals("m") ? " прокатился" : " прокатилась")
                            + " на аттракционе");
                poll.setTicket(poll.getTicket() - 1);
                if (poll.getTicket() > 0) {
                    line.offerLast(poll);
                }
            }
        }

    }

    public static List<Person> generateClients() {
        Person a = new Person("Ivan", "Vivanov", "m", 0);
        Person b = new Person("Alex", "Lalexin", "m", 2);
        Person c = new Person("Olya", "Golgina", "f", 4);
        Person d = new Person("Petya", "Epetrov", "m", 1);
        Person e = new Person("Tanya", "Atanina", "f", 3);

        List<Person> clients = new ArrayList<>();
        clients.add(a);
        clients.add(b);
        clients.add(c);
        clients.add(d);
        clients.add(e);

        return clients;
    }
}
