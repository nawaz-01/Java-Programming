package InheritanceChallenge_P1;

public class Main {
    public static void main(String[] args) {
        Employee joe = new Employee("Joe", "01/04/2000", 77001, "01/01/2020");
        System.out.println(joe);
        System.out.println("Age = " + joe.getAge());
        System.out.println("Pay =" + joe.collectPay());

        Employee tim = new Employee("Tim", "01/04/1990", 77002, "01/01/2021");
        System.out.println(tim);

    }

}
