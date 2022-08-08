
package kauhospitalsystem;

public class Doctor extends Staff {
    
 private double consultationFees; 

    public Doctor(double consultationFees, String sepicalization, String staffid, int id, String name, String nationality, char gender, int phone) {
        super(sepicalization, staffid, id, name, nationality, gender, phone);
        this.consultationFees = consultationFees;
        
    }
    
    public double getConsultationFees () {
        return consultationFees;
    }
    
    
    public void getConsultationFees (double consultationFees) {
        this.consultationFees = consultationFees;
    }
    
    
    public String toString () {
        return super.toString() + "\n\tConsultation Fees :" + getConsultationFees() ;
        
    }
}

