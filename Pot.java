import java.util.Scanner;

/**
 * Pot
 */
public class Pot {
    public static void main(String[] args) {
        


    Scanner sc = new Scanner("3\n23\n17\n43\n52\n22");
    //Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int sum = 0;{
    while (sc.hasNextLine()) {
        int number = Integer.parseInt(sc.next());
        int modulo = number%10;
        number = number/10;
        int result = (int) Math.pow(number,modulo);
        sum = sum + result;
    }
    System.out.println(sum);
}
}
}

   