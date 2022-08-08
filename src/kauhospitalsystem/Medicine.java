
package kauhospitalsystem;

public class Medicine {
    
 private int medicineCode;
 private String name;
 private double price;
    
  public Medicine (int medicineCode , String name , double price){
      
      this.medicineCode = medicineCode;
      this.name = name;
      this.price = price;
      
  }  
    
  
   //Getters---------------------
   public int getMedicineCode (){
       return medicineCode;
   } 
  
   public String getName (){
       return name;
   } 
   
   public double getPrice (){
       return price;
   } 
  
  
   //Setters--------------------------------------
   public void setMedicineCode (int medicineCode){
       this.medicineCode = medicineCode;
   } 
  
   public void setName (String name){
       this.name = name;
   } 
   
   public void setPrice (double price){
       this.price = price;
   } 
   
   
   
   //-------------------
   public String toString (){
       return "\tMedicine Code: " + getMedicineCode() + "\n\tName: " + getName() + "\n\tPrice :" + getPrice() ;
   }

    
}

