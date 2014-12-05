/**
 * Created by anastasiakazakova on 06/12/14.
 */
public class Bank {
    public static final int MaxClientsNumber = 100;
    private BankClient clients[] = new BankClient[MaxClientsNumber];
    private int numberOfClients = 0;

    public long addClient(Person p) {
        if (numberOfClients < MaxClientsNumber) {
            clients[numberOfClients] = new BankClient(p.getName(), p.getId());
            numberOfClients++;
            return clients[numberOfClients - 1].getClientId();
        } else {
            return -1;
        }
    }
}
