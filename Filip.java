import java.util.Scanner;

public class Filip {

    public static void main(String[] args) {
        String str = "479 985";
        Scanner fromstr = new Scanner(str); 
        String input = fromstr.next();
        System.out.println(input);
        String seconInput = fromstr.next();
        System.out.println(seconInput);
        int a = Integer.parseInt(input);
        int b = Integer.parseInt(seconInput);
        System.out.println(a);
        System.out.println(b);
        int reverseA = 0;
        int reverseB = 0;

        while (a!=0 && b!=0){
            int digitA = a%10; //why by %10
            int digitB = b%10;
            System.out.println(digitA);
            reverseA = reverseA * 10 + digitA;
            reverseB = reverseB * 10 + digitB;
            a /=10; // a = a/10
            b /=10; // b = b/10
        }

    System.out.println("The reveser of a is: " + reverseA);
    System.out.println("The reveser of b is: " + reverseB);
       
    if (reverseA>reverseB){
        System.out.println( reverseA);
    } else {
        System.out.println(reverseB);
    }

        fromstr.close();
    }
}