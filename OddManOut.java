import java.util.*;

/**
 * OddManOut
 */
public class OddManOut {

    public static void main(String[] args) {

        Scanner sc = new Scanner("6\n3\n1 2147483647 2147483647\n5\n3 4 7 4 3\n5\n2 10 2 10 5\n7\n10 20 30 30 20 10 40\n5\n9 9 7 7 8\n3\n 10 110 10");
        //Scanner sc = new Scanner (System.in);
        int testCases = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<Integer> listOfNonDuplicates = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            int caseNumber = i + 1;
            int nonDuplicate = 0;
            int guestsNumber = sc.nextInt();
            for (int j = 0; j < guestsNumber; j++) {
                int number = sc.nextInt();
                list.add(number);
            }
            for (Integer number : list ) {
                if (Collections.frequency(list, number) == 1)
                    nonDuplicate = number;
            }
            
           System.out.println("Case #" + caseNumber + ": " + nonDuplicate);
        }
    }
}