import java.util.Random;

/**
 * Created by anastasiakazakova on 06/12/14.
 */
public class BankClient extends Person {
    private long clientId;

    public BankClient(String _name, long _id) {
        super(_name, _id); //Call parent constructor
        Random rand = new Random();
        clientId = Math.abs(rand.nextLong());
    }

    public long getClientId() {
        return clientId;
    }

    public boolean checkClientId(long id) {
        return (id == clientId); //Can use 'this' as well.
    }

    public boolean checkClientCredentials(long passport, long id) {
        return (this.id == passport) && (this.clientId == id); //protected 'id' is needed here!
    }
}
