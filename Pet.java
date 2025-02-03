public class Pet{
   //private data fields
   private String name;
   
   //public Constructor
   public Pet(){
      this.setName("");
   }
   
   //public mutator method
   public void setName(String newName){
      this.name = newName;
   }
   
   //public accessor, returns data
   public String getName(){
      return this.name;
   }
   
   //public toString method that prints out all of the object state
   public String toString(){
      String output = "Pet information \nName: ";
      output+= this.getName();
      return output;
   }
   
   //Main method
   public static void main(String args[]){
      Pet myPet1 = new Pet();
      Pet myPet2 = new Pet();
      myPet1.setName("Pet Name");
      myPet2.setName("Buster Brown");
      //System.out.println(myPet1.getName()); //>Returns only the name and does not go to "toString"
      System.out.println(myPet1+"\n\n"+myPet2);//>Goes directly to "toString"
   }
}