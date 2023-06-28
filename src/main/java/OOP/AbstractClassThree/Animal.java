package OOP.AbstractClassThree;


public abstract class Animal {
    //
     void eat(){
         System.out.println("Animal");
     }

    public static void main(String[] args) {
        Animal d = new Dog();
        d.eat();
        /*
        * we are colling the parent and child at the same time
        *print::
        * Animal
        * Dog
        * */

    }

}

class Dog extends Animal {


    public void eat() {


        super.eat();
        System.out.println("Dog");


    }

}
