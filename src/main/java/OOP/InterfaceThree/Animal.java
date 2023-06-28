package OOP.InterfaceThree;

public class Animal {
    public String name;
}

interface sleep{
    // all variable are:
    /*
    * constant
    * final static
    * */

    int x = 5;

    default void sleep(){
        System.out.println("ñññññ");
        }
    }




class Dog extends Animal implements sleep {
    public String name;

    public Dog() {
       // sleep.x=6; //give an error bzc is like a constant


    }
}