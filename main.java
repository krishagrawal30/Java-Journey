class Vehicle {
    public void mode() {
        System.out.println("Vehicles are modes of transport.");
    }

    public void workeasy() {
        System.out.println("Make human work easy.");
    }
}

class Car extends Vehicle {
    void wheel() {
        System.out.println("It has 4 wheels.");
    }

    void pollution() {
        System.out.println("It causes pollution.");
    }
}

class Bicycle extends Vehicle {
    void wheels() {
        System.out.println("It has 2 wheels.");
    }

    void eco() {
        System.out.println("It is eco-friendly.");
    }
}
        
public class main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle b = new Bicycle();
        System.out.println("About Cars : ");
        car.mode();
        car.workeasy();
        car.wheel();
        car.pollution();
        System.out.println("About Bicycles : ");
        b.mode();
        b.workeasy();
        b.wheels();
        b.eco();
    }
}