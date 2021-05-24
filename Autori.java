import java.util.Scanner;

/**
 * Autori
 */
public class Autori {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner("Knuth-Morris-Pratt");
        String [] strArray = sc.nextLine().split("[^A-Z]+");
        for(String output : strArray){
            System.out.print(output);  
        }
    
    }

}