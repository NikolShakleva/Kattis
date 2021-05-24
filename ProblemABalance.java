import java.util.Scanner;
import java.util.Stack;

public class ProblemABalance {

public static void main (String[] args) {

    //public int checkBracket(){
    Stack<String> stackBracket = new Stack<String>();
    //Stack <String> stackSquare = new Stack <String>();
    //Stack<String> pair = new Stack<String>();

    Scanner sc = new Scanner("4\n([)]");
    //String p = "6\n[(()(]";
    //Scanner sc = new Scanner(System.in);
    
    int limit = sc.nextInt();
    sc.nextLine();
    String [] input = sc.nextLine().split("");
    for(int i=0; i<limit; i++){
        if(input[i].equals("(") || input[i].equals("[")) {
            stackBracket.push(input[i]);
         } else if (!stackBracket.isEmpty() && (
                   (input[i].equals(")") && stackBracket.peek().equals("(")) ||
                   (input[i].equals("]") && stackBracket.peek().equals("[")))) {
         stackBracket.pop();
      
    } else {
        stackBracket.push(input[i]);;
    }
}
        if(stackBracket.isEmpty()){
        System.out.println("1");
        } else {
            System.out.println("0");
        }
       
}
}