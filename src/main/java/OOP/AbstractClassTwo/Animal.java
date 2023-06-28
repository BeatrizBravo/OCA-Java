package OOP.AbstractClassTwo;


public abstract class Animal {
    //can hold a commund method
     void eat(){
         System.out.println("Animal");
     }

    /*
     */
     */
}

class Dog extends Animal {


    public void eat() {

        // If we want to access to the parent method
        // we use super
        super.eat();
        System.out.println("Dog");


    }

}
