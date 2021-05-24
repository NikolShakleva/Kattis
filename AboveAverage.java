import java.util.ArrayList;
import java.util.Scanner;
/**
 * AboveAverage
 */
public class AboveAverage {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner("5\n5 50 50 70 80 100\n7 100 95 90 80 70 60 50\n3 70 90 80\n3 70 90 81\n9 100 99 98 97 96 95 94 93 91");
        int firstLine = sc.nextInt();
        double result=0.0;
        String print="";
        for(int i = 0; i<firstLine;i++){
            double students = sc.nextInt();
            ArrayList<Double>list = new ArrayList<>();
            for(int j=0;j<students;j++){
                double grade = sc.nextInt();
                list.add(grade);
            }
            double sum = 0;
            for(int p=0; p<list.size();p++){
                sum = sum+ list.get(p);
            }
            double average = sum/students;
            double count=0;
            for(int k = 0; k<list.size();k++){
                if(list.get(k)>average) count++;
            }
            result = (count/students)*100;
            //NumberFormat nf = new DecimalFormat("#.###");
            //print = nf.format(result);
            // if(!print.contains(".")){
            //     System.out.printf("%f.3",print);
            // } else {
            //     System.out.println( print + "%");
            // }
            result = Math.round(result*1000.0)/1000.0;
            if (result-Math.floor(result)==0){
                print = result + "00";
            } else{
                print = result + "";
            } 
            System.out.println( print + "%");
        }
        
    }
}