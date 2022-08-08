
package kauhospitalsystem;

public class Patient extends Person {
   
    private String illness;
    private String bloodGroup;
    private Doctor doctor;
    private Medicine [] medicine;
    private Room room;
    private final int totalMedicine;
    
    public Patient(String illness, String bloodGroup, int id, String name, String nationlity, char gender, int phone, int totalMedicine ) {
        
        super(id, name, nationlity, gender, phone);
        this.illness = illness;
        this.bloodGroup = bloodGroup;
        this.totalMedicine = totalMedicine;
        medicine = new Medicine [totalMedicine];
        
        
    }
   
    
   //Getters----------------------
   public int getTotalMedicine (){
       return totalMedicine;
   } 
   
    public String getIllness (){
        return illness;
    }
   
    public String getBloodGroup (){
        return bloodGroup;
    }
   
    public Doctor getDoctor (){
        return doctor;
    }
    
    public Medicine getMedicine (int index){
        
        return medicine[index];
    }
    
    public Room getRoom (){
        return room;
    }
    
    
    //Setters-------------------------------
    public void setIllness (String illness){
        this.illness = illness;
    }
    
    public void setBloodGroup (String bloodGroup){
        this.bloodGroup = bloodGroup;
    }
    
    public void setMedicine (Medicine medicine , int index ) {
        this.medicine[index] = medicine;
    }
    
    public void setDoctor (Doctor doctor){
        this.doctor = doctor;
    }
    
    public void setRoom (Room room){
        this.room = room;
    }
    
    
    //other-----------------------
    public double calTotalBill (){
        double total=0;
        for (int i = 0 ; i< medicine.length ; i++ ){
            total+= medicine[i].getPrice() ;
        }
     
        total+= getRoom().getCharges();
   
        total+= getDoctor().getConsultationFees();
        
        
        return total;
    }
    
    public String printPatientBasicInfo (){
        
        return " " ;
    }
    
    public String toString (){
        return super.toString() + "\n-------------------------------------------------------------------------------------------" + "\nIllness: " +
        getIllness() + ", Blood Group: " + getBloodGroup() + "\n-------------------------------------------------------------------------------------------";
    }
    
}





