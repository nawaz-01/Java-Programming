public class Main {
    public static void main(String[] args) {

        // Car car = new Car();
        // car.setMake("Porsche");
        // car.setModel("Carrera");
        // car.setColor("White");
        // car.setDoors(2);
        // car.setConvertible(true);
        // System.out.println("make =" + car.getMake());
        // System.out.println("model =" + car.getModel());
        // car.describeCar();

        // Car targa = new Car();
        // targa.setMake("Porsche");
        // targa.setModel("Targa");
        // targa.setColor("Red");
        // targa.setDoors(2);
        // targa.setConvertible(false);
        // targa.describeCar();

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