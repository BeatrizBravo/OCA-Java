package OOP.Interface;

public class Animal {


}

interface sleep{
    void sleep();
}
interface sleepB{
    void sleep();
}
interface sleepC{
    void sleep();
}

class Dog extends Animal implements sleep, sleepB,sleepC{
    // we can implment multiple interfaces
    public String name;
    public Dog(){

    }

    @Override // force you to do like in abstract class
    public void sleep() {

    }
}