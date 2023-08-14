public class MotorVehicle {
    String modelName;
    int modelNumber;
    int modelPrice;
    static int  discountRate;
    void display(String name,int modelNumber,int modelPrice){
        this.modelName=name;
        this.modelNumber=modelNumber;
        this.modelPrice=modelPrice;
        System.out.println("The model-Name is :"+name);
        System.out.println("The model-number is : "+modelNumber);
        System.out.println("The price of the model is: "+modelPrice);
    }
    MotorVehicle(int discountRate){
        System.out.println("The discount rate is :"+discountRate);

    }

class car extends MotorVehicle{
    car(int discountRate) {
        super(discountRate);
    }
    @Override
    void display(String modelName, int modelNumber, int modelPrice) {
        super.display(modelName, modelNumber, modelPrice);
    }

}
public static void main(String[] args) {
      MotorVehicle m=new MotorVehicle(20);
    //   m.display("Afsar", 100, 20);
    MotorVehicle.car foo = m.new car(discountRate);
    foo.display("Afzal", 200, 200);
      
    }

}


