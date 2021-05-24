package app;

import java.util.Scanner;;

/**
 * Tildes
 */
public class Tildes {

    //Fields:
    private int [] mergedSet;
    private int [] size;
    private int guestsNumber;

    //Constructor:
    public Tildes (int guestsNumber) {
        this.guestsNumber = guestsNumber;
        mergedSet = new int[guestsNumber];
        for(int i = 0; i<guestsNumber; i++){
            mergedSet[i] = i+1;
        }
        size = new int[guestsNumber];
        for(int i=0; i<guestsNumber;i++) { size[i] = 1; }
    }
   //Methods:
   public int guestcount(){
       return guestsNumber;
   }

   public boolean connected(int p, int q){
       return find(p)==find(q);
   }
   public int find(int p) {
       while (p!=mergedSet[p-1]) p = mergedSet[p-1];
       return p;
   }

   public void union (int p, int q) {
       int i = find(p);
       int j = find(q);
       if (i==j) return ;;

       if(size[i-1] < size[j-1]) {mergedSet[i-1]=j; size[j-1]+=size[i-1];}
       else                  {mergedSet[j-1]=i; size[i-1]+=size[j-1];}
       guestsNumber--;
   }
   public int findSize(int p){
       int num = find(p);
       int toReturn = size[num-1];
      return toReturn;
   }

   public static void main (String [] args){
//try {


    //BufferedReader bf  = BufferedReader(new IntpuStreamReader("5 11\ns 1 \nt 1 2\ns 1\nt 1 2\ns 1\nt 4 5\ns 5\nt 1 5\ns 2\nt 3 2\ns 3"));
    //Scanner sc  = new Scanner(System.in);
    Scanner sc = new Scanner("10 11\nt 1 10\nt 1 2\nt 1 3\ns 1\ns 2\ns 3\ns 4\nt 5 7\ns 5\ns 6\ns 10");
    //String input = "5 11\ns 1 \nt 1 2\ns 1\nt 1 2\ns 1\nt 4 5\ns 5\nt 1 5\ns 2\nt 3 2\ns 3";
    //InputStreamReader rd = new InputStreamReader("5 11\ns 1 \nt 1 2\ns 1\nt 1 2\ns 1\nt 4 5\ns 5\nt 1 5\ns 2\nt 3 2\ns 3");
    //BufferedReader bf = new BufferedReader(new FileReader("file.txt"));
    StringBuilder sb = new StringBuilder();
    int guestsNumber = sc.nextInt();
    int queiesNumber = sc.nextInt();
    sc.nextLine();
    Tildes td = new Tildes(guestsNumber);
    int k = 0;
    while (k<queiesNumber){
        String [] line = sc.nextLine().split(" ");
        if(line.length ==3){
        int p = Integer.parseInt(line[1]);
        int q = Integer.parseInt(line[2]);
            td.union(p, q);
        } else {
            int size = Integer.parseInt(line[1]);
            int returnSize = td.findSize(size);
            sb.append(returnSize + "\n");
         }
         k++;
    }
    System.out.println(sb);
//} catch (Exception e) {
//}
   }

}

