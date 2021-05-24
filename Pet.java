import java.util.*;


public class Pet {

    public static void main (String [] args) {

       //Scanner sc = new Scanner ("4 4 3 3\n5 4 3 5\n5 5 2 4\n5 5 5 1\n4 4 4 4");
        Scanner sc = new Scanner(System.in);
    

        ArrayList<Integer> input = new ArrayList<>();

           for(int j = 0; j<5; j++) {
            String arr [] = sc.nextLine().split(" ");
            int sum = 0;
            for(int i = 0; i<4; i++) {
                sum = sum + Integer.parseInt(arr[i]);
            }
            input.add(sum);


           }
          int maxValue = Collections.max(input);
          int index = 1+ input.indexOf(maxValue);

          System.out.println(index  + " " + maxValue);

        }

    }
