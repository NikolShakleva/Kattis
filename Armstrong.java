
public class Armstrong {

    public static void main(String[] args) {
        int firstDigit = 0;
        int secondDigit = 0;
        int thirdDigit = 0;
        for (int i =120; i<=500; i++){
        int number = i;
        firstDigit = i%10;
        number = number/10;
        secondDigit = number%10;
        number = number/10;
        thirdDigit = number%10;
        if ((firstDigit*firstDigit*firstDigit)+(secondDigit*secondDigit*secondDigit)+(thirdDigit*thirdDigit*thirdDigit)==i) {
            System.out.println(i);
        }
        }
    }
}