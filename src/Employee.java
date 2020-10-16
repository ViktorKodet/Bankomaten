import java.util.ArrayList;
import java.util.List;

/**
 * Created by Viktor Kodet <br>
 * Date: 2020-09-30 <br>
 * Time: 10:52 <br>
 * Project: IntelliJ IDEA <br>
 */
public class Employee extends Person {

    private double salary;
    private List<Loan> loansApproved = new ArrayList<>();

    Employee(String name, String id, double salary) {
        super(name, id);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Loan> getLoansApproved() {
        return loansApproved;
    }

    public void setLoansApproved(List<Loan> loansApproved) {
        this.loansApproved = loansApproved;
    }
}
