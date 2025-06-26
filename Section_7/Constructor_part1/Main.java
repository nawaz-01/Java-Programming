package Constructor_part1;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setColor("White");
        car.setDoors(2);
        car.setConvertible(true);
        System.out.println("make =" + car.getMake());
        System.out.println("model =" + car.getModel());
        car.describeCar();
        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setColor("Red");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.describeCar();
    }
}