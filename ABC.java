import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * ABC
 */
public class ABC {

    public static void main(String[] args) {
        //Scanner sc = new Scanner("8 7 6\nCAB");
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int first = sc.nextInt();
        numbers.add(first);
        int second = sc.nextInt();
        numbers.add(second);
        int third = sc.nextInt();
        numbers.add(third);
        String order = sc.next();
        int C = Collections.max(numbers) ;
        int A = Collections.min(numbers);
        int B;
        if((first < second && second < third) || (third < second && second < first)) {
            B = second; 
        } else if(( first > second  && first < third) || (first > third && first < second)){
            B = first;
        } else {
            B = third;
        }
        //String order = sc.nextLine();
        if (order.equals("ABC")){
            System.out.println(A + " " + B + " " + C);
         } else if (order.equals("BAC")){
            System.out.println(B + " " + A + " " + C);
        } else if (order.equals("BCA")){
            System.out.println(B + " " + C + " " + A);
        } else if (order.equals("ACB")){
            System.out.println(A + " " + C + " " + B);
        } else if (order.equals("CAB")){
            System.out.println(C + " " + A + " " + B);
        } else if (order.equals("CBA")){
            System.out.println(C + " " + B + " " + A);
        }
        sc.close();

    //if the input was a whole number then how can i divide it into individual digits 
    // for recerse digits just reverse the order of first and third 
        //int third = 123%10;
        //int second = (123/10)%10;
        //int first = (123/100)%10;
        //System.out.println(first + " " + second + " " + third);
    }
}