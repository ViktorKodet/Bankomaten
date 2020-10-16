/**
 * Created by Viktor Kodet <br>
 * Date: 2020-09-30 <br>
 * Time: 10:51 <br>
 * Project: IntelliJ IDEA <br>
 */
public abstract class Person {
    private String name;
    private String id;

    Person(String name, String id) {
        setName(name);
        setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
