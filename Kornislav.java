import java.util.*;

/**
 * Kornislav
 */
public class Kornislav {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner("5 7 1 8");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        Collections.sort(list);
        int result  = list.get(0)*list.get(2);
        System.out.println(result);


    }
}
