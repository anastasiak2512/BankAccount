/**
 * Created by anastasiakazakova on 06/12/14.
 */
public class Person {
    protected long id;
    protected String name;

    private int age = 0;

    public Person(String _name, long _id) {
        name = _name;
        id = _id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
