import java.util.*;

/**
 * Prva
 */
public class Prva {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner("4 4\nluka\no#a#\nkula\ni#a#");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        String vertical0 = "";
        ArrayList <String> horizontal = new ArrayList<>();
        while (sc.hasNext()) {
            String nikol = sc.next();
            horizontal.add(nikol);
        }
        for (int p = 0; p <horizontal.size(); p++){
            for(int i =0; i<columns ;i++) {
                vertical0 = vertical0 + "" + horizontal.get(p).charAt(i);
            }
            horizontal.add(vertical0);
            vertical0="";
}
for (int k =0; k<horizontal.size(); k++) {
    String [] split = horizontal.get(k).split("#");
}
}
}