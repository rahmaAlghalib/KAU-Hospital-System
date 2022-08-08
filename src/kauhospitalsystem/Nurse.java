
package kauhospitalsystem;

public class Nurse extends Staff {
    
   private int experience; 

    public Nurse(int experience, String sepicalization, String staffid, int id, String name, String nationality, char gender, int phone) {
        
        super(sepicalization, staffid, id, name, nationality, gender, phone);
        this.experience = experience;
    }
    
    public int getExperience (){
        return experience;
    }
    
    public void setExperience (int experience){
        this.experience = experience;
    }
    
    public String toString (){
        return super.toString() + "\n\tExperience Year: " + getExperience();
    }
}

