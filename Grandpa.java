import java.util.*;


public class Grandpa{

    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner("4\nWBBW\nWBWB\nBWWB\nBWBW");
    int n = sc.nextInt();
    //String [] horizontal = new String [n];
    //String [] vertical = new String [n];
    sc.nextLine();
    while (sc.hasNext()){
       String row = sc.next();
        String [] temp = row.split("");
        for(int i=2; i<temp.length; i++){
            if(temp[i].equals(temp[i-1]) && temp[i].equals(temp[i-2])) {
                System.out.println("0");
                break;
            }
        }
        if(row.codePoints().filter(ch -> ch =='W').count()!=row.codePoints().filter(ch -> ch =='B').count()){
            System.out.println("0");
            break;
        }
        }


             }


       // }

    //}
        
    
    
    
    
    
    
    
    
    
    //String [] grid = new String [n];
    // for(int i=0; i<n;i++) {
    //     grid[i] = sc.nextLine();
    // }
    // for(int i=0; i<n; i++) {
    //    int w = 0; int b=0;
    //     if(grid[i].contains("W")) {
    //        w = grid[i].split("\\W").toString().length();
    //     } else{
    //         b = grid[i].split("\\B").toString().length();
    //     }
    //     if (w==b) {}


        

    }


}

