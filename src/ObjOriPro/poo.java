package ObjOriPro;
public class poo {

  public static void main(String[] args) {
    

    System.out.println("My first auto");

    Auto myAuto = new Auto(2,90,0);

    System.out.println(myAuto.currentSpeed);
    myAuto.accelerate();
    System.out.println(myAuto.currentSpeed);
    System.out.println(myAuto.numberDoors);
    System.out.println(myAuto.maxSpeed);


    System.out.println("My second auto");

    Auto myAuto2 = new Auto();
    System.out.println(myAuto2.currentSpeed);
    System.out.println(myAuto2.numberDoors);

  }
  
}

class Auto {

  int numberDoors;
  int maxSpeed;
  float currentSpeed;

  public Auto() {
    numberDoors = 3;
    maxSpeed = 150;
    currentSpeed = 0;
    System.out.println("In constructor without params");
  }

  public Auto( int doors , int speedMax, int speedCurrent ) {
    numberDoors = doors;
    maxSpeed = speedMax;
    currentSpeed = speedCurrent;
    System.out.println("In constructor with params");
  }

  /*
  
    public Auto( int numberDoors , int maxSpeed, int currentSpeed ) {
      this.numberDoors = numberDoors;
      this.maxSpeed = maxSpeed;
      this.currentSpeed = currentSpeed;
      System.out.println("In constructor with params");
    }

  */

  public void accelerate() {
    currentSpeed += 15;
  };

  public void brake() {};

}

