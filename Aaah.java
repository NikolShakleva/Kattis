import java.util.Scanner;

public class Aaah{

    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in);
            String johnInput = sc.nextLine();
            String doctor = sc.nextLine();

        if (johnInput.contains(doctor)){
            System.out.println("go");
         } else {
System.out.println("no");
            }
        }
    }

// i can do that in the following way:
// i can comapare the lenghts of the strings.
// if the lenght of the doctor is equal or less than john then then go
// if(johnInput.lenght =>doctor.lenght) {
    //System.err.println("go");
    //{else}
    //System.out.println("no");