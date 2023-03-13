public class topicExercises8 {

  public static void main(String[] args) {
    
    Person myPerson = new Person();
    myPerson.setAge(25);
    myPerson.setName("Tanjiro");
    myPerson.setTelephone("5525258585");

    System.out.println("Hi, my name is " + myPerson.getName() + ", I'm " + myPerson.getAge() + " years old and you can call me at " + myPerson.getTelephone() + ".");

  }
  
}

class Person {
  int age;
  String name;
  String telephone;

  public void setAge(int age) {
    this.age = age;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public int getAge() {
    return this.age;
  }
  public String getName() {
    return this.name;
  }
  public String getTelephone() {
    return this.telephone;
  }
}