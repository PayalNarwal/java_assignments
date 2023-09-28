class MotorVehicle{
    String modelName ;
    int modelNo;
    double modelPrice;
    public MotorVehicle() {
    }
    public MotorVehicle(String modelName, int modelNo, double modelPrice) {
        this.modelName = modelName;
        this.modelNo = modelNo;
        this.modelPrice = modelPrice;
    }
    void display(){
        System.out.println("modelName : "+modelName);
        System.out.println("modelNo : "+modelNo);
        System.out.println("modelPrice : "+modelPrice);
    }
}
class Car extends MotorVehicle{
    double disRate = 2.2;
    Car(){
        super();
    }
    Car(String modelName, int modelNo, double modelPrice) {
        super(modelName, modelNo, modelPrice);
    }
    
    void display(){
        System.out.println("modelName : "+ super.modelName);
        System.out.println("modelNo : "+ super.modelNo);
        System.out.println("model price before discount :"+ super.modelPrice);
        discount();
        System.out.println("model price after discount :"+ modelPrice);
    }
    void discount(){
        super.modelPrice -= super.modelPrice * disRate * 0.01;
    }
}

public class Q1_motorVehicle {
    public static void main(String[] args) {
        MotorVehicle m1 = new MotorVehicle();
        m1 = new Car();
        m1.modelName = "AirRacer-Pro";
        m1.modelNo = 1;
        m1.modelPrice = 1000000;
        m1.display();

        Car m2 = new Car("AirRacer",2,100000);
        m2.disRate = 5;
        m2.display();

    }
}
