import java.util.ArrayList;
import java.util.List;

/**
 * Created by Viktor Kodet <br>
 * Date: 2020-09-30 <br>
 * Time: 10:52 <br>
 * Project: IntelliJ IDEA <br>
 */
public class Customer extends Person {


    private int accountCounter = 0;
    private int loanCounter = 0;

    Customer(String name, String id) {
        super(name, id);
    }

    public void printMe() {
        System.out.println(getName() + " " + getId());
    }


    public int getAccountCounter() {
        return accountCounter;
    }

    public void increaseAccountCounter() {
        this.accountCounter++;
    }

    public int getLoanCounter() {
        return loanCounter;
    }

    public void increaseLoanCounter() {
        this.loanCounter++;
    }
}
