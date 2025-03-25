import java.util.ArrayList;
public class Asn5{
   public static void main(String[] args){
      ArrayList<String> StringArr = new ArrayList<String>();
      ArrayList<Integer> IntArr = new ArrayList<Integer>();
      
      IntArr.add(1);
      IntArr.add(2);
      IntArr.add(4);
      IntArr.add(8);
      
      StringArr.add("Pie");
      StringArr.add("Cake");
      StringArr.add("Cookie");
      StringArr.add("Shake");
      
            
      for(String out: StringArr){
         System.out.println(out);
      }
      
      System.out.println();
      
      IntArr.forEach((out) -> {System.out.println(out);});
      
      System.out.print("\n"+StringArr+"\n"+IntArr);
   }
}