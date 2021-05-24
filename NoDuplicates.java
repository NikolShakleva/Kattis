import java.util.*;

/**
 * NoDuplicates
 */
public class NoDuplicates {

    public static void main(String[] args) {
        
        //Scanner sc = new Scanner("IN THE RAIN AND THE SNOW");
        Scanner sc = new Scanner (System.in);
        String line = sc.nextLine();
        String [] strArray = line.split(" ");
        Set<String> words = new HashSet<>();
        Set <String> duplicates = new HashSet<>();
        for (String wordString : strArray){
            if(!words.add(wordString)) duplicates.add(wordString);
            }
        if (duplicates.isEmpty()) System.out.println("yes");
        else System.out.println("no");

    }
}