


import java.util.*;
import edu.princeton.cs.algs4.MaxPQ;

public class Seats implements Comparable<Seats> {

    private double vote;
    private double seats;

public Seats (int vote) {
    this.vote = vote;
}

public void addSeat(){
    seats = seats+ 1.0;
}
@Override
public int compareTo (Seats that) {
    if(this.vote/ (1+ this.seats) > that.vote/(1+that.seats)) return 1;
    if (this.vote/ (1+ this.seats) < that.vote/(1+that.seats)) return -1;
    return 0;

}
@Override
public String toString(){
    int seatsI =  (int) seats;
    String.valueOf(seats);
   return String.valueOf(seatsI);
}


    public static void main(String [] args) {

        Scanner sc = new Scanner("9\n14\n38\n35\n36\n37\n41\n12\n24\n14\n55");
        //Scanner sc = new Scanner(System.in);

        int parties = sc.nextInt();
        int seats = sc.nextInt();
        // priority queue always creates n+1 more objects because it has to stat from index 1
        MaxPQ<Seats>pq = new MaxPQ<Seats>(parties);
        // use an array because you want to print the values(seats) per party
        // the seats should be printed in the way they were inserted
        // you cannot print the queue because the queu is sorted from heap down(the higest number is on top)
        Seats [] array = new Seats [parties];
        Stack <Seats> stack = new Stack<Seats>();

        for(int i = 0; i<parties; i++){
            int votes = sc.nextInt();
            Seats st = new Seats(votes);
            array[i] = st;
            stack.push(st);
            pq.insert(st);
           
        }

       for(int i=0; i<seats;i++){
          Seats current = pq.max();
          pq.delMax();
          current.addSeat();
          pq.insert(current);

    }
   System.out.println("stack loop");
    for(Seats stacks : stack){
        System.out.println(stacks);
    }
System.out.println();
System.out.println("array Loop");
    for(Seats  st  : array) {
        System.out.println(st.toString());
    }
    System.out.println("Stack.pop()");
    for(int i = 0; i<parties; i++){
        System.out.println(stack.pop());
    }


 
        
    }
}