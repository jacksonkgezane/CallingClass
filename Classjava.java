import java.io.*;
 
class Classjava {
 
    // The method that calls the main() method
    // Note that this method is not static
    static void MainJava()
    {
        System.out.println("SecondClass");
 
        // Calling the main() method
        ;
    }
 
    // main() method
    public static void main(String[] args)
    {
        System.out.println("FirstClass");
 
        // Calling the SecondClass() method
        // so that main() method is called externally
        MainJava();
    }
}