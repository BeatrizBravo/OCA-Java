package org.example;

/**
 * A Java program begins EXECUTION with its main() method.
 * A main() method is the GATEWAY between the startup of a Java process,
 *       => which is managed by the Java Virtual Machine (JVM),
 *          and the beginning of the programmer’s code.
 *        The JVM calls on the underlying system to:
 *        -allocate memory and CPU time,
 *        -access files, etcetera.
 * The main() method lets us HOOK our code into this process, keeping it alive long enough to do the work we’ve coded.
 */

public class Main {
    public static void main(String... args) {
        //STATIC =  static binds a method to its class
        //Java doesn’t need to create an object to call the main() method—JVM does this, more or less, when loading the class name given to it.
        //VOID =  no data returns control. it’s good practice. the main() method changes the program state
        //from started to fi nished
        // an array String[] args, String args[] or String... args
        //The characters ... are called varargs (variable argument lists)

        /**
         * The variable name args =>list contains  values that were read in (arguments) when the JVM started, we write in the console
         */

        System.out.println("value: "+ args[0]);  // accesses the fi rst element of the array
        System.out.println("value: "+args[1]);
    }
}


// in the console we can to compile and execute this code in the console or cdm by being in the righ folder
// compile =      javac Main.java  it create Main.class
// execute =      java Main.java


/**
 * rules:
 * ■ Each file can contain only one class.
 * ■ The filename must match the class name, including case, and have a .java extension.
 */

/**
 * using args
 * compile =      javac Main.java
 * execute =      java Main.java B B
 */