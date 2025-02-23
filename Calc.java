public class Calc{
   private double num1;
   private double num2;
   
   public Calc(){
      num1 = 0;
      num2 = 0;
   }
   
   public void setNum1(double num){
      num1 = num;
   }
   
   public void setNum2(double num){
      num2 = num;
   }
   
   public double getNum1(){
      return num1;
   }
   
   public double getNum2(){
      return num2;
   }
   
   public double add(){
      double result = num1+num2;
      return result;
   }
   public double subtract(){
      double result = num1-num2;
      return result;
   }
   public double multiply(){
      double result = num1*num2;
      return result;
   }
   public double divide(){
      double result = num1/num2;
      return result;
   }
   
}