package Section_7_OOPS.Challenges_30_Accounts;

public class Main {
    public static void main(String[] args) {
        Accounts myAccount = new Accounts();
        myAccount.setNumber("12345");
        myAccount.setCustomerName("John Doe");
        myAccount.setCustomerEmail("john.doe@example.com");
        myAccount.setCustomerPhone("555-1234");
        myAccount.depositFunds(1000);
        myAccount.withdrawlFunds(500);
        myAccount.withdrawlFunds(600);
    }

}
