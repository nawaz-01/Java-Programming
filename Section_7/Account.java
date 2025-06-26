public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public String getNumber() {
        return number;
    }

    public void depositFunds(double depositeAmount) {
        balance += depositeAmount;
        System.out.println("Deposite of $" + depositeAmount + " Made.New balance is $" + this.balance);
    }

    public void withdrawlFunds(double withdrawlAmount) {
        if (balance - withdrawlAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + balance + "in your account.");
        } else {
            balance -= withdrawlAmount;
            System.out.println("Withdrawl of $" + withdrawlAmount + "processes, Remaining balance is $" + balance);
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

}
