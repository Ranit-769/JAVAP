package zoo;
import animals.animal;

public class Animal{
    public static void main(String[] args) {
        animal a = new animal();
        a.eat();
    }
}


//-------------------------------- for protected things----------------------

//import animals.animal;
//
//class Dog extends animal {
//    public void callEat() {
//        eat();   // ✅ allowed because of inheritance
//    }
//}
//
//// Package: zoo
//class Test {
//    public static void main(String[] args) {
////        Animal a = new Animal();
////        // a.eat(); ❌ ERROR (not subclass)
//        Dog d1=new Dog();
//        d1.callEat();
//    }
//}