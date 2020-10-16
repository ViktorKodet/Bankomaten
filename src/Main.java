import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Bank bank = new Bank();
        bank.newEmployee("Karin", "1234567", 40_000.50);
        bank.newCustomer("Jens Schmeid", "137787");
        bank.newCustomer("Coola Janne", "1432");
        bank.newAccount("jens schmeid", 10_000.0, 0.11);
        bank.findAccounts("jens schmeid");
        bank.newLoan("coola janne", "karin", 100_000.0, 0.31);

        bank.printCustomers();
        //bank.accountInfo("jensschmeid137787_A_0");
        bank.findLoans("coola janne");

        bank.loanInfo("coolajanne1432_L_0");

        bank.getLoan("coolajanne1432_L_0").changeInterestRate(bank.findEmployee("Karin"), 0.12);

        bank.loanInfo("coolajanne1432_L_0");

    }
}
