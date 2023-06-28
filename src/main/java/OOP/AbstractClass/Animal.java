package OOP.AbstractClass;


public abstract class Animal {
    //abstract method
    public abstract void eat();
    //java force to implement the abstract method
    // we need to do implement te method with OVERRIDE
    /*
    (the abstract method cannot be PRIVATE, bzc we can not do override)
    *
    *
    * STATIC => cannot be use, It produce a complitaion error
    * */
     */
}

class Dog extends Animal {


   // @Override   => can be optional
    public void eat() {
    /*
    *public
    * protected
    * [default] => en este caso
    * // only we can use the same level or higher
    * private (the abstract method cannot be private, bzc we can not do override)
    *
    *
    * STATIC => cannot be use
    * */

    }

}
