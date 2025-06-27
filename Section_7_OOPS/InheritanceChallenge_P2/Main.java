package InheritanceChallenge_P2;

import InheritanceChallenge_P1.Employee;

public class Main {

    public static void main(String[] args) {

        Employee tim = new Employee("tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("joe", "11/11/1990", "03/03/2020", 55000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        HourlyEmployee bob = new HourlyEmployee("Mary", "05/05/1970", "03/03/2022", 15);
        System.out.println(bob);
        System.out.println("Bob's Paycheck = $" + bob.collectPay());
        System.out.println("Bob's Holiday Pay = $" + bob.getDoublePay());
    }

}
