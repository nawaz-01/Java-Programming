package Challenges_30_Accounts;

public class Accounts {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Accounts() {
        System.out.println("Empty Constructor Called");
    }

    public Accounts(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = email;
        this.customerPhone = phone;
    }

    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + balance);
    }

    public void withdrawlFunds(double withdrawlAmount) {
        if (balance - withdrawlAmount < 0) {
            System.out.println("Insufficient Funds ! You only have $" + balance + "in your Account.");
        } else {
            balance -= withdrawlAmount;
            System.out.println("withdrawl of $" + withdrawlAmount + "processed, Remaining balance = $" + balance);
        }

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
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
