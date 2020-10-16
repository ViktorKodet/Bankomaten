import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Viktor Kodet <br>
 * Date: 2020-09-30 <br>
 * Time: 10:54 <br>
 * Project: IntelliJ IDEA <br>
 */
public class Loan implements Interestable {
    private Customer owner;
    private Employee approvedBy;
    private String loanName;
    private double loanAmount;
    private LocalDate dateOfApproval;
    private double interestRate;

    Loan(Customer customer, Employee employee, double amount, double interestRate) {
        setOwner(customer);
        setLoanName(customer);
        setApprovedBy(employee);
        setLoanAmount(amount);
        setInterestRate(interestRate);
        setDateOfApproval();
    }

    public void printMe() {
        System.out.println("Owner : " + owner.getName());
        System.out.println("Date of approval : " + dateOfApproval);
        System.out.println("Approved by : " + approvedBy.getName());
        System.out.println("Loan amount : " + loanAmount);
        System.out.println("Interest rate : " + interestRate);
    }


    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public Employee getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(Employee approvedBy) {
        this.approvedBy = approvedBy;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public LocalDate getDateOfApproval() {
        return dateOfApproval;
    }

    public void setDateOfApproval() {
        this.dateOfApproval = LocalDate.now();
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
    public void changeInterestRate(Employee employee, double newRate) throws IOException {
        FileWriter out = new FileWriter("" + getLoanName() + ".txt", true);
        String previousInterestRate = "" + getInterestRate();
        setInterestRate(newRate);
        String s = "" + LocalDateTime.now() + "   " + employee.getName() + " : " + previousInterestRate + "--->" + getInterestRate() + "\n";
        out.write(s);
        out.close();

    }

    public void setLoanName(Customer owner) {
        String s = owner.getName();
        s = s.toLowerCase();
        s = s.replaceAll("\\s+", "");
        loanName = s + owner.getId() + "_L_" + owner.getLoanCounter();
        owner.increaseLoanCounter();
    }

    public String getLoanName() {
        return loanName;
    }
}
