import java.util.Scanner;

public class ADifferentProblem{

    public static void main (String [] args){

Scanner sc = new Scanner (System.in);
while (sc.hasNext())  {
    Long a  = sc.nextLong();
    Long b = Long.parseLong(sc.next());
    // this is teh same as int b = sc.nextInt(). But here i do it with a formauls.
    // Ususlly java is doing this formula withou me noticing behind the scenes
    // but here we put long because 10^5 is more than the value of an int
 
   Long s = Math.abs(a-b);
   System.out.println(s);
}
    }
}