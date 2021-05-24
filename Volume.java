import java.util.*;

/**
 * Volume
 */
public class Volume {

   private double number;
   private String unit;
   private double value;
   private String description;
   private int []  unitValue  = {768, 192, 96, 48, 6, 3, 1};
   private  Map <String,Double> map =  new HashMap<>();
   private static final Map<Integer, String> unitsMap = new HashMap<>();
  static {
      unitsMap.put(769,"gal");
      unitsMap.put(192,"qt");
      unitsMap.put(96,"pt");
      unitsMap.put(48,"c");
      unitsMap.put(6,"fl oz");
      unitsMap.put(3,"tbsp");
      unitsMap.put(1,"tsp");
  }

public Volume (String description) {
    this.description = description;
    String [] words = description.split(" ");
    value = Double.parseDouble(words[0]);
    //number = Double.parseDouble(words[0]);
    if (words.length == 3){
        unit = words[1] + " " + words[2];
    } else {
        unit = words[1];
    }
    //convertUnits();
}
private void convertUnits (){
if (unit.contains("teaspoon") || unit.contains("teaspoons") || unit.contains("tsp")){
    unit = "tsp";
    map.put(unit,value*unitValue[6]);
    value = value*unitValue[6];
} else if  (unit.contains("tablespoon") || unit.contains("tablespoons") || unit.contains("tbsp")){
    unit = "tbsp";
    map.put(unit,value*unitValue[5]);
    value = value*unitValue[5];
} else if (unit.contains("fluid ounce") || unit.contains("fluid ounces") || unit.contains(" fl oz")){
    unit = "fl oz";
    map.put(unit,value*unitValue[4]);
    value = value*unitValue[4];
} else if (unit.contains("cup") || unit.contains("cups") || unit.contains("c")){
    unit = "c";
    map.put(unit,value*unitValue[3]);
    value = value*unitValue[3];
} else if (unit.contains("pint") || unit.contains("pints") || unit.contains("pt")){
    unit = "pt";
    map.put(unit,value*unitValue[2]);
    value = value*unitValue[2];
}else if (unit.contains("quart") || unit.contains("quarts") || unit.contains("qt")){
    unit = "qt";
    map.put(unit,value*unitValue[1]);
    value = value*unitValue[1];
} else if (unit.contains("gallon") || unit.contains("gallons") || unit.contains("gal")){
    unit = "gal";
    map.put(unit, value*unitValue[0]);
    value = value*unitValue[0];
}
}

 public Volume add(Volume other){
     Volume thisObject =  new Volume(description) ;
     thisObject.convertUnits();
     double thisnumber = thisObject.map.get(unit);
     thisObject.convertUnits();
     double othernumber = other.map.get(unit);
     return new Volume(thisnumber + othernumber + "tsp");

}

public String toString(){
convertUnits();
int i = 0;
int p = 0;
while (value/unitValue[i]<0){
i = p;
i++;
}
p=i+1;
String print ="";
for(int j = p; value/unitValue[j]>0 && j<unitValue.length;j++) {
    int div = (int) (value/unitValue[j]);
    int modulo = (int) (value % unitValue[j]);
    value = modulo;
    print = print + " " + div + " " + unitsMap.get(unitValue[j]) + " and ";
}
return print;
}
}
