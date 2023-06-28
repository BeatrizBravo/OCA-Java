package OOP.AbstractClassFour;


public abstract class Animal {

    public Animal(){  //constructor
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    private Dog(){
        // can be any bzc cada clase tiene su propio method constructor
        super(); // construct method can go only in the 1st line
        System.out.println("Dog");
    }


}
