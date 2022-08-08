
package kauhospitalsystem;

public abstract class Staff extends Person {
    
  private String sepicalization, staffid;
    
  
  public Staff (String sepicalization, String staffid, int id, String name, String nationality, char gender, int phone){
      
     super(id, name , nationality , gender , phone);
     this.sepicalization = sepicalization;
     this.staffid = staffid ;
    
     
  }
  
  
  public String getSpecialization (){
      return sepicalization;
  }
  
  public String getStaffid (){
      return staffid;
  }
  
  
  
  public void setSpecailization (String specialization){
      this.sepicalization = specialization;
  }
  
  public void setStaffid (String staffid){
      this.staffid = staffid;
  }
  
  
  public String toString () {
      return super.toString() + "\n\tSpecilaization: " + getSpecialization() + "\n\tStaff ID: " + getStaffid() ;
  }
}

