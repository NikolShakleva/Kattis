import java.util.Scanner;
import java.util.Stack;

public class Backspace {

    public static void main (String [] args) {

        Stack<String> stack = new Stack<String>();
        StringBuilder sb = new StringBuilder();
        //Scanner sc = new Scanner ("a<a<a<aa<<");
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split("");
        for (int i=0; i<input.length; i++) {
            if(!input[i].equals("<")){
                stack.push(input[i]);
            } else {
                if(!stack.isEmpty() && !stack.peek().equals("<")) {
                stack.pop();
                }         
            }
        }
        for(String st : stack) {
            sb.append(st);
        }
        System.out.println(sb);
        }
    }
