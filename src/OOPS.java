public class OOPS {
    public static  void main(String argsp[]){
//        pen p1=new pen();
////        p1.color="red";
////        p1.tip=5;
////        p1.setColor("yellow");
//          p1.setTip(8);
//
//          p1.getcolor();;
//          p1.gettip();
////        System.out.println(p1.color);
//          System.out.println(p1.tip);
//        Student s1 = new Student();
//         s1.name="Ranit";
//         s1.roll=1;
//         s1.password="abcd";
//         s1.mask[0]=100;
//         s1.mask[1]=60;
//         s1.mask[2]=80;
//        System.out.println(s1.name);
//        System.out.println(s1.roll);
//        System.out.println(s1.password);
//
//        for (int i=0;i<3;i++){
//            System.out.println(s1.mask[i]);
//        }
//
//         Student s2 = new Student(s1);
//         s2.password="xyz";
//
//
//        System.out.println(s2.name);
//        System.out.println(s2.roll);
//        System.out.println(s2.password);
//
//        s1.mask[2]=50;
//
//        for (int i=0;i<3;i++){
//            System.out.println(s2.mask[i]);
//        }
//    mammal m1=new mammal();
//        m1.eat();
//        m1.breath();
//        m1.walk();
//    fish f1=new fish();
//       f1.eat();
//       f1.breath();
//       f1.swim();
//    Bird b1= new Bird();
//       b1.eat(); 
//       b1.breath();
//       b1.fly();
//
//      operation o1= new operation();
//        o1.sum(2,3);
//        o1.sum((float)2.5,(float) 3.1);
//        o1.sum(2,3,4);
//        B a1=new  B();
//        a1.eat();
//        Horse h1=new Horse();
//        Chicken c1= new Chicken();
//        h1.eat();
//        h1.walk();
//        c1.eat();
//        c1.walk();
//        bear b1=new bear();
//        b1.eatgrass();;
//        b1.eatmeat();
//        Dog d1 = new Dog("Tommy");
//
//        d1.sound();        // abstract method
//        d1.eat();          // default method
//        Animalss.info();     // static method
//
//        System.out.println("Legs: " + Animalss.LEGS);
        Students s1=new Students();
        s1.setter("ranit",2);
        s1.getter();
        s1.school="abc";
        Students s2=new Students();
        s2.getter();
        System.out.println(s2.school);

        Homes h1= new Homes();
        System.out.println(h1.color);

    }

}

class House{

    String color;
    House(){
        System.out.println("this is my house");
    }
}

class Homes extends House{
    Homes(){
        super();
        super.color="red";
        System.out.println("there are lot of homes");

    }
}
/// ----------------------------------------------------------
class Students{
    String name;
    int roll;
    static  String school;

    void setter(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    void getter(){
        System.out.println(name);
        System.out.println(roll);
    }
}
//---------------------------------------------------------
 interface Animalss {

    // By default: public static final
    int LEGS = 4;   // automatically public static final

    // By default: public abstract
    void sound();

    // default method (has body)
    default void eat() {
        System.out.println("Animal is eating");
    }

    // static method
    static void info() {
        System.out.println("This is Animal interface");
    }
}
 class Dog implements Animalss {

    public String name;

    public Dog(String name) {
        this.name = name;
    }

    // must override abstract method
    public void sound() {
        System.out.println(name + " says Woof!");
    }
}

//------------------------------------------------
interface Herbivore{
   void eatgrass();
}
interface carnivore{
    void eatmeat();

}

class bear implements Herbivore,carnivore{
      public void eatgrass(){
          System.out.println("Bear eat grass ");
     }
      public  void eatmeat(){
         System.out.println("also some bear eat meat");
     }
}
//-----------------------------------------------------
abstract class Animals{

    void eat(){
        System.out.println("eat");
    }
    abstract void walk();
}

class Horse extends  Animals{
    void walk(){
        System.out.println("Horse can Walk in 4 legs");
    }
}

class Chicken extends  Animals{
    void walk(){
        System.out.println("Chicken can Walk in 2 legs");
    }

}
//----------------------------------------------------------
//override
class A{
    void eat(){
        System.out.println("A eat");
    }
}
class B extends A{
    void eat(){
        System.out.println("B eat");
    }
}
/// over loding
class operation{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void  sum( float a,float b){
        System.out.println(a+b);
    }
    void sum(int a, int b,int c){
        System.out.println(a+b+c);
    }
}

class animal {
    String color;
    void eat(){
        System.out.println("eat");
    }
    void breath(){
        System.out.println("Breath");
    }
}

class mammal extends animal{
  void walk(){
      System.out.println("mammal can walk");
  }
}

class fish extends animal{
    void swim(){
        System.out.println("fish can swim");
    }
}

class Bird extends animal{
    void fly(){
        System.out.println("birds can fly ");
    }
}
//------------------------------------------
class Student{
    String name;
    int roll;
    String password;
    int mask[];

    //copy constructor
//    Student(Student s1) {
//        mask= new  int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//        this.mask=s1.mask;
//    }

    Student(Student s1) {
        mask= new  int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i=0;i<mask.length;i++) {
            this.mask[i] = s1.mask[i];
        }
    }

    Student(){
        mask= new  int[3];
        System.out.println("This is a student class .");
    }

    Student(String name){
        mask= new  int[3];
        this.name=name;
    }
    Student(int roll){
        mask= new  int[3];
        this.roll=roll;
    }
}
//---------------------------------------
class pen{
    private String color;
    int tip;

    void getcolor(){
        System.out.println(color);
    }
    void  setColor(String color){
        this.color=color;
    }
    void gettip(){
        System.out.println(tip);
    }
    void setTip(int tip){
        this.tip=tip;
    }
}

///--------------------------------------------------------------------------------

//class oops {
//    public static void main(String[] args) {
//        Person p = new Person();
////         System.out.println(p.age);
//         p.showAge();
//    }
//}
//
//class Person {
//    private int age = 25;
//
//    private void showAge() {
//        System.out.println(age);
//    }
//
//    public void accessInsideClass() {
//        showAge();  // ✅ allowed
//    }
//}
//
