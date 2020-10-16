import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Viktor Kodet <br>
 * Date: 2020-09-30 <br>
 * Time: 10:56 <br>
 * Project: IntelliJ IDEA <br>
 */
public class Bank {
    private List<Customer> customers = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public void printCustomers() {
        List<Customer> tempList = getCustomers();
        for (Customer c : tempList) {
            System.out.println(c.getName());
        }
    }

    /**
     * Gör ett nytt konto i kontolistan, hittar en customer i customerlistan med hjälp av dess namn
     * @param customerName kundens namn
     * @param saldo hur mycket som sätts in på kontot från början
     * @param interest ränta
     */
    public void newAccount(String customerName, Double saldo, double interest) {
        getAccounts().add(new Account(findCustomer(customerName), saldo, interest));
        findCustomer(customerName).increaseAccountCounter();
    }

    public void newLoan(String customerName, String employeeName, double amount, double interestRate) {
        getLoans().add(new Loan(findCustomer(customerName), findEmployee(employeeName), amount, interestRate));
        findCustomer(customerName).increaseLoanCounter();
    }

    public void newCustomer(String name, String id) {
        addCustomer(new Customer(name, id));
    }

    public void newEmployee(String name, String id, double salary) {
        addEmployee(new Employee(name, id, salary));
    }

    public void findLoans(String customerName) {
        for (Loan l : loans) {
            if (customerName.equalsIgnoreCase(l.getOwner().getName())) {
                System.out.println(l.getLoanName());
            }
        }
    }

    public void findAccounts(String customerName) {
        for (Account a : accounts) {
            if (customerName.equalsIgnoreCase(a.getOwner().getName())) {
                System.out.println(a.getAccountName());
            }
        }
    }

    public Account getAccount(String accountName) {
        for (Account a : accounts) {
            if (accountName.equalsIgnoreCase(a.getAccountName())) {
                return a;
            }
        } return null;
    }

    public Loan getLoan(String loanName) {
        for (Loan l : loans) {
            if (loanName.equalsIgnoreCase(l.getLoanName())) {
                return l;
            }
        } return null;
    }

    public Customer findCustomer(String customerName) {
        for (Customer c : customers) {
            if (customerName.equalsIgnoreCase(c.getName())) {
                return c;
            }
        }
        return null;
    }

    public Employee findEmployee(String employeeName) {
        for (Employee e : employees) {
            if (employeeName.equalsIgnoreCase(e.getName())) {
                return e;
            }
        }
        return null;
    }

    public void loanInfo(String loanName) {
        for (Loan l : loans) {
            if (loanName.equalsIgnoreCase(l.getLoanName())) {
                l.printMe();
            }
        }
    }

    public void accountInfo(String accountName) {
        for (Account a : accounts) {
            if (accountName.equalsIgnoreCase(a.getAccountName())) {
                a.printMe();
            }
        }
    }


    public List<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer) {
        getCustomers().add(customer);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        getEmployees().add(employee);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void addLoans(Loan loan) {
        getLoans().add(loan);
    }
}
