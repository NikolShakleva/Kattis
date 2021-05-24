import java.util.*;
import edu.princeton.cs.algs4.Insertion;

public class Students {

     private String [] names;
     private String [] grades;
     private String [] arrayInarray;

public Students (int n) {
    names = new String [n];
    grades = new String [n];
    arrayInarray  = new String [n];
}

public void exchange(String a [], int i, int j ) {
String swap = a[i];
a[i] = a[j];
a[j]=swap;
}

public static boolean less(String a, String b){
    return a.compareTo(b)<0;
}

public void insertionSort(String [] a){

    int n = a.length;
    for(int i = 1; i<n;i++){
        for(int j =i; j>0&&less(a[j], a[j-1]); j--){
            exchange(a, j, j-1);
        }
    }


}

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner("10\nabelone A\nandersine A\nbo A\nbosse A\nanton F\nantonina F\nanders A\nkonstantin F\nwilliam F\nandreas A");
        int n = sc.nextInt();
        sc.nextLine();
        Students st  = new Students (n);
        for(int i = 0; i<n; i++){
         st.names[i] = sc.next();
         st.grades[i] = sc.next();
         st.arrayInarray[i] = st.names[i]+ " " + st.grades[i];
        }
         for(int i = 1; i<n; i++){
              for(int j=i; j>0; j--){
                if(less(st.grades[i],st.grades[i-1]) ){
                    st.exchange(st.names, i, j);
                    st.exchange(st.grades, i, j);
                    st.exchange(st.arrayInarray, j, j-1);
                 //st.exchange(st.names, j-1, j);
                }
            }
                if(less(st.names[i],st.names[i-1])&&st.grades[i].equals(st.grades[i-1])){
                    for(int j=i; j>0; j--){
                    st.exchange(st.arrayInarray, j, j-1); 
                }
                
            }
        }
        //     //for(int i = 1; i<n; i++){
        //         for(int j=i; j>0; j--){
        //            if((less(st.names[i],st.names[i-1])) && (st.grades[i].equals(st.grades[i-1]))){
        //             st.exchange(st.arrayInarray, j, j-1);    
        //    }
        // } 
    //}


// for(int i = 1; i<n; i++) {
//     if(st.grades[i-1].equals(st.grades[i])){
//         for(int j=i; j<n;j--){
//         if (st.names[j].compareTo(st.names[j-1])<0){
//             st.exchange(st.names,j,j-1);
//             st.exchange(st.grades, j, j-1);
//         } else break;
//     }
// }   else  {
//     for(int k = i; k<n; k--){
//         if((st.grades[i-1].compareTo(st.grades[k-1])<0)) {
//             st.exchange(st.grades, k, k-1);
//             st.exchange(st.names,k,k-1);
//         } else break;
// }
// }
    // }
    System.out.println(Arrays.toString(st.arrayInarray));
    }
}
