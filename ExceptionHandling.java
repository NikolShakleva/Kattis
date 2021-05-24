import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * ExceptionHandling
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        

        // Exercise 1:

        int i = 12;
        int p = 10;
        int k = 5;
        try {
           p =  i/k;
           Scanner sc = new Scanner(new File ("cvt.txt"));
           sc.next();

           String words = "nikol shakleva";
           String str [] = words.split(" ");
           String lastName = str[2];
        }
        catch (IOException e ) {
            System.out.println(" There is no file like this " + e);
        }
         catch (ArithmeticException e) {
            System.out.println("Devision by 0" + e);
        }
        catch (Exception e) {
            // the Exception should be as specific as possible.
            // Hence we first check for the specific exceprions and then we check for a general exception
            // You cannot put general exception as a first catch statement
            System.out.println("No specified exception");
        }

        finally {
    System.out.println(" You cannot have a return statement in the final block - its a rule");
        }

    
        // here it prints the initail value of p, before the cath statement
        System.out.println(p);
        // here it prints the initail value of p

    }


}