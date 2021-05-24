import java.util.*;
//import edu.princeton.cs.algs4.ST;
public class AddingWords {


    public static void clear(HashMap<String, Integer> st) {
        for (String key : st.keySet()){
            st.put(key,0);
        }
    }

    public  static void clearMirror(HashMap <Integer,String> st) {
        for (Integer key : st.keySet()){
            st.put(key,"null");
        }
    }

    public static void updateKey(HashMap<Integer,String> map, String value, int newkey){
        int oldkey = 0;
        for(Integer key : map.keySet()){
            if(value.equals(map.get(key))) {
                oldkey = key;
                break;
            }
        }
            map.put(newkey,value);
            map.remove(oldkey,value);
            
        }
        

    public static void main(String[] args) {
        //Scanner sc = new Scanner ("def foo 3\ncalc coma + bar =\ndef bar 7\ndef programming 10\ncalc coma + foo - bar =\ncalc coma - coma + foo =\ncalc foo + bar - foo =\ndef coma 12\ncalc coma - coma =\ncalc coma - bar - programming =\n def coma 3\ncalc coma - programing =\ncalc foo - foo + bar =\ncalc foo + programming =\ncalc programming - bar =");
        //Scanner sc  = new Scanner("def foo 3\ncalc foo + bar =\ndef bar 7\ndef programming 10\ncalc foo + bar =\ndef is 4\ndef fun 8\ncalc programming - is + fun =\ndef fun 1\ncalc programming - is + fun =\nclear");
        //Scanner sc = new Scanner("def three 3\ndef four 4\ndef two 2\ndef five 5\ndef mfive -5\ndef seven 7\ndef eleven 11\ndef twelve 12\ndef five 10\ncalc four + three =\ncalc eleven + three - twelve =\ncalc twelve - three - eleven + seven =\ncalc eleven - twelve - four =\ncalc five + five =\nclear");
        //Scanner sc = new Scanner("def five 5\ndef five 10\ndef two 2");
        HashMap<String, Integer> st = new HashMap<String, Integer>();
        HashMap<Integer,String> stMirror = new HashMap<Integer,String>();

        while (sc.hasNext()){
            String line = sc.next();
            if (line.startsWith("def")) {
                String word = sc.next();
                int number = Integer.parseInt(sc.next());
                st.put(word,number);
                if(!stMirror.isEmpty()&& stMirror.containsValue(word)) AddingWords.updateKey(stMirror,word,number);
                stMirror.put(number,word);
            } else if (line.startsWith("calc")){
                String l = sc.next();
                int v = 0;
                String result ="";
                String temp= "";
                String sign ="+";
                while (sc.hasNext()){ 
                    if (!st.containsKey(l)) {
                        temp = l;
                        st.put(temp,0);
                    }
                    if(st.containsKey(l)&&sign.equals("+")){
                        v = v + st.get(l);
                    } else if (st.containsKey(l)&&sign.equals("-")) {
                        v = v-st.get(l);
                    }
                    st.remove(temp);
                    sign = sc.next();
                    result = result + " " + l + " " + sign;
                    if(sign.equals("=")){
                    break;}
                    l = sc.next(); 
                }
                if (stMirror.containsKey(v)&& temp.equals("")){
                System.out.println(result +  " " + stMirror.get(v)); }
                else {
                    System.out.println(result + " " + "unknown");
                }
            } else if (line.startsWith("clear")){
                st.clear();
                stMirror.clear();
            }
        }

    }
}