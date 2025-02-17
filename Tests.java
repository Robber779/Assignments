import java.util.Scanner;
public class Tests{

   private double ave;
   private int score, count;
   
   public Tests(){
      ave = 0;
      count = 0;
      this.setScore(0);
      
   }
   
   public double getAve(){
      return ave;
   }
   
   public void getAverage(){
      Scanner scan = new Scanner(System.in);
      double sum = 0;
      int count2 = -1;
      while(getScore() != -1){
         sum+= getScore();
         count2++;
         System.out.println("To calculate the average, please enter a number below. Enter -1 to stop."+score);
         setScore(scan.nextInt());
      }
      
      if(count2!=-1){ ave = sum/count2; }
      count = count2;
   }
   
   public int getScore(){//mostly confused on what this is used for
      return score;
   }
   
   public int getCount(){
      return count;
   }
   
   public void setScore(int newScore){//mostly confused on what this is used for
      score = newScore;
      
   }
   
   public String toString(){
      String output;
      if(count == 0){
         return "The average of the 0 scores entered is NaN";
         //return output;
      }
      return String.format("The average of the "+getCount()+" scores entered is %.2f.", getAve());//String.format and %.(whatever number)f limits the amount of decimal places
   }

   public static void main(String[] args){
      Tests test1 = new Tests();
      test1.getAverage();
      System.out.println(test1);
      
   }
}