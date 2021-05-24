import java.util.Scanner;

public class NewFilip {

    public static void main(String[] args) {
        String str = "479 985";
        Scanner sc = new Scanner(str); 
        String input = ""; 
        int digit = 0;
        while (sc.hasNext()){
             input = sc.next();
             int number = Integer.parseInt(input);
             //i <=100 because the input it a 3 digit number 
             for (int i = 10; i<=1000; i=i*10){
               digit = number  % i;
              
               
             }
        }
        System.out.println(digit);
      

    }
}