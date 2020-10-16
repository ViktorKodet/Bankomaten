import java.time.LocalDate;

/**
 * Created by Viktor Kodet <br>
 * Date: 2020-09-30 <br>
 * Time: 10:54 <br>
 * Project: IntelliJ IDEA <br>
 */
public class Account implements Interestable {
    private Customer owner;
    private String accountName;
    private double saldo = 0;
    private LocalDate dateOfCreation;
    private double interestRate;

    Account(Customer customer, double saldo, double interest) {
        setOwner(customer);
        setAccountName(customer);
        setSaldo(saldo);
        setInterestRate(interest);
        setDateOfCreation();
    }

    public void printMe() {
        System.out.println("Owner : " + owner.getName());
        System.out.println("Date of creation : " + dateOfCreation);
        System.out.println("Saldo : " + saldo);
        System.out.println("Interest : " + interestRate);
    }


    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation() {
        this.dateOfCreation = LocalDate.now();
    }

    public String getAccountName() {
        return accountName;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
    @Override
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    //TODO lagra vem som ändrar
    public void changeInterestRate(Employee employee, double interestRate) {
        this.interestRate = interestRate;
    }

    public void setAccountName(Customer owner) {
        String s = owner.getName();
        s = s.toLowerCase();
        s = s.replaceAll("\\s+", "");
        accountName = s + owner.getId() + "_A_" + owner.getAccountCounter();
        owner.increaseAccountCounter();
    }
}
