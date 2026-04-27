abstract class MotorVehicle {
    String modelName;
    int modelNumber;
    double price;

    MotorVehicle(String n, int num, double p) {
        modelName = n;
        modelNumber = num;
        price = p;
    }

    abstract void display();
}

class Car extends MotorVehicle {
    double discountRate;

    Car(String n, int num, double p, double d) {
        super(n, num, p);
        discountRate = d;
    }

    double discount() {
        return price * discountRate / 100;
    }

    void display() {
        System.out.println(modelName + " " + modelNumber);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount());
    }
}

class MainA3 {
    public static void main(String[] args) {
        Car c = new Car("Honda", 123, 800000, 10);
        c.display();
    }
}