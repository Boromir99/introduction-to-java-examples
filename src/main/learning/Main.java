package learning;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("George", 1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println(account.toString());


    }
}
