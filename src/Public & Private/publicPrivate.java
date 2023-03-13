public class publicPrivate {

  public static void main(String[] args) {
    
    Auto myAuto = new Auto();

    // All public
    //myAuto.brand = "Ford";
    //System.out.println(myAuto.brand);

    // With Get & Set
    myAuto.setBrand("Ford");
    myAuto.setMaxSpeed(120);
    myAuto.setStatus(true);
    System.out.println(myAuto.getBrand());
    System.out.println(myAuto.getMaxSpeed() + " kph");

    if (myAuto.isStatus() == true) {
      System.out.println("It's on");
    } else {
      System.out.println("It's off");
    }

  }
  
}

class Auto {
  private String brand;
  private int maxSpeed;
  private boolean status;

  // Getters & Setters

  // Setters never return
  public void setBrand(String brand) {
    this.brand = brand;
  }
  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }
  public void setStatus(boolean status) {
    this.status = status;
  }

  public String getBrand() {
    return this.brand;
  }
  public int getMaxSpeed() {
    return this.maxSpeed;
  }
  public boolean isStatus() {
    return this.status;
  }
}

/* ABSTRACT EXAMPLE
 
 abstract class Vehicle {
   private String sound;
   
   abstract public void setSound(String sound);
   abstract public String getSound();
  }
  
*/