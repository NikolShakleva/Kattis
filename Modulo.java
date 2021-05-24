import java.util.*;

/**
 * Modulo
 */
public class Modulo {

    public static void main(String[] args) {
        
        //Scanner sc = new Scanner("42\n84\n252\n420\n840\n126\n42\n84\n420\n126");
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        while(sc.hasNext()){
                int line = sc.nextInt();
                int modulo = line%42;
                set.add(modulo);
            }
            System.out.println(set.size());
        }
    }


