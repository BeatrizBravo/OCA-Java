package learning.classestructure;

/**
 * Java does not require that the class be public
 * could be public class Persona or class Persona
 *
 * Two classes in the **same file** => at most one of the classes in the file is allowed to be public.
 * public class match with the name of the file.
 */

/*
* field = variable
* method = functions
* */
public class Person {
    //atribute + methods = members of the class
     public  String name; //atribute   //PUBLIC =  signify that this method may be called from other classes.


    public String getName() { //method that get the variable you given this case name
        return name;            //The return type is String
    }

    public void setName(String name) {  //void means that no value at all is returned
        this.name = name;               //the caller should pass in one String parameter and expect nothing to be returned.
    }


    //The full declaration of a method is called a "method signature"
}

class PersonaOne{ //only one can be public in a file in this case is Person, line 15

}



