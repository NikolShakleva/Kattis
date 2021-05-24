import java.util.*;

import javax.print.PrintException;

import edu.princeton.cs.algs4.BinarySearchST;
import edu.princeton.cs.algs4.ST;


public class Flights implements Comparable <Flights> {
    private int seconds;

    public Flights(int seconds){
        this.seconds = seconds;
    }

    @Override
    public int compareTo(Flights that) {
        if(this.seconds > that.seconds) return 1;
        if(this.seconds < that.seconds) return -1;
        return 0;
    }

    public static int convertToSeconds(String input){
        String [] arr = input.split(":");
        int time = Integer.parseInt(arr[0])*3600 + Integer.parseInt(arr[1])*60 + Integer.parseInt(arr[2]);
        return time;

    }

    public static void main(String[] args) {
    Scanner sc = new Scanner("18 5\n09:00:00 Chicago\n09:00:03 Phoenix\n09:00:13 Houston\n09:00:59 Chicago\n09:01:10 Houston\n09:03:13 Chicago\n09:10:11 Seattle\n09:10:25 Seattle\n09:14:25 Phoenix\n09:19:32 Chicago\n09:19:46 Chicago\n09:21:05 Chicago\n09:22:43 Seattle\n09:22:54 Seattle\n09:25:52 Chicago\n09:35:21 Chicago\n09:36:14 Seattle\n09:37:44 Phoenix\ndestination 09:03:13\ndestination 09:37:45\ndestination 09:22:43\ncancel 09:22:43\ndestination 09:22:43");
    BinarySearchST<Integer, String > st = new BinarySearchST<Integer, String>();  
    StringBuilder sb = new StringBuilder();
    int flights = sc.nextInt();
    int operations = sc.nextInt();
    sc.nextLine();
    for(int i = 0; i< flights; i++) {
        String seconds = sc.next();
        int time = Flights.convertToSeconds(seconds);
        String city = sc.next();
        st.put(time,city);   
    }
    for (int i = 0; i<operations;i++) {
        String line = sc.next();
        if(line.equals("destination")){
            int key = Flights.convertToSeconds(sc.next());
            String value = st.get(key);
            String print = (value==null) ? "-" : value;
            System.out.println(print);

        } else if (line.equals("cancel")){ {
            int key = Flights.convertToSeconds(sc.next());
            st.delete(key);
        }
        } else if (line.equals("delay")){
            int key = Flights.convertToSeconds(sc.next());
            String value = st.get(key) + Integer.parseInt(sc.next());
            st.delete(key);
            st.put(key,value);

        } else if (line.equals("next")){
            int key = Flights.convertToSeconds(sc.next());
            int floorKey = st.floor(key);
            String value = "";
            
        } else if (line.equals("count")){

        } else if (line.equals("reroute")){

        }
    }
        //String  [] arr = sc.next().split(" ");
        //if(arr.length == 2){
            //if(arr[0].equals("destination")){
            //int key = Integer.parseInt(arr[1]);
            // String value = st.get(key);
            // String print = (value==null) ? "-" : value;
            // sb.append(print);
            // System.out.println(sb);
            //} //else //here you will write the delay
        //}

    //}
}
}

