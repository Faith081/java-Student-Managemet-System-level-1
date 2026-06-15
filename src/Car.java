// classes and object = state,behavior, memory model

//public class Car {
//    String myCar;
//    int speed;
//
//
//    Car(String newCar, int carSpeed){
//
//        this.myCar = newCar;
//        this.speed = carSpeed;
//    }
//
//
//    public void start(){
//      speed = 60;
//      System.out.println("The car is running on " + speed + "km/h");
//
//    };
//
//    public void brake(){
//     speed = 0;
//     System.out.println("The car has stopeed " + speed + "km/h");
//    };
//
//
//
//
//}

// Encapsulation = getters, setters, access control
//class BankAccount {
//     private double balance;
//
//     public BankAccount(double accBalance){
//
//         balance = accBalance;
//
//     }
//
//     // getters = allow you to read but you cant modify
//     public double getBalance(){
//       return balance;
//     };
//
//     // setters allow you to read from a private method  and modify the value
//
//      public void deposit(double amount){
//          if(amount > 0){
//              balance += amount;
//          }
//      }
//
//
//      public void withdraw(double amount){
//          if(amount > 0 && amount <= balance){
//              balance -= amount;
//          }
//
//      }
//
//
//        };



//class Animal{
//     void eat(){
//         System.out.println("This animal eats food. ");
//     }
//
//}
//
//
//
//class Dog extends Animal{
//    void barks(){
//        System.out.println("The animal barks");
//    }
//}


class Animal{
    Animal(String type){
        System.out.println("The animal tyeps is: ");
    }

}



class Dog extends Animal{
    Dog(){
        super("Domestic");
        System.out.println("Dog is created");
    }
}





































