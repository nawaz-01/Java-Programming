package Constructor_part2;

public class Main {
    public static void main(String[] args) {

        Account bobsAccount = new Account();
        bobsAccount.withdrawlFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawlFunds(50.0);

        bobsAccount.withdrawlFunds(150.0);

        bobsAccount.depositFunds(100.0);
        bobsAccount.withdrawlFunds(45.55);
        bobsAccount.withdrawlFunds(54.56);

        bobsAccount.withdrawlFunds(49.00);

        bobsAccount.setNumber("12345");
    }
}