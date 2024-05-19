
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author dell
 */
public class p_Owner {
   
    private int id ; 
 private String firstname ; 
 private String lastname ; 
 private String phone ; 
 private String email; 
 private String Adresse; 
 
   
 public Integer getId(){
     return this.id; 
 }
 public void setId(int id ){
      this.id=id; 
 }
 
 public String getFName(){
  return this.firstname; 
 }
 public void setFName(String firstname){
     this.firstname=firstname;
     }
 
 
 public String getLName(){
  return this.lastname; 
 }
 public void setLName(String lastname){
     this.lastname=lastname;
     }
 
 public String getPhone(){
  return this.phone; 
 }
 public void setPhone(String phone){
     this.phone=phone;
     }
 
 public String getEmail(){
  return this.email; 
 }
 public void setEmail(String email){
     this.email=email;
     }
 public String getAdresse(){
  return this.Adresse; 
 }
 public void setAdresse(String Adresse){
     this.Adresse=Adresse;
     }
 
 public p_Owner(){}
 public p_Owner(int ID, String FName , String LName, String Phone,String Email, String Adresse ){
 
     this.id=ID;
     this.firstname =FName ;
     this.lastname=LName;
     this.phone=Phone;
     this.email=Email;
     this.Adresse=Adresse;
 }
 
 
 
 
 //create fuction to add new owner 
 //first create the owner in the data base 
 
 
 public boolean addnewowner(p_Owner  owner){
    
     PreparedStatement ps ;
     String addQuery ="INSERT INTO `property_owner`( `fname`, `lname`, `phone`, `email`, `adresse`) VALUES (?,?,?,?,?)";
    
     try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
            ps.setString(1, owner.getFName());
            ps.setString(2, owner.getLName());
            ps.setString(3, owner.getPhone());
            ps.setString(4, owner.getEmail());
            ps.setString(5, owner.getAdresse());
            
            return (ps.executeUpdate() > 0);
          
        } catch (SQLException ex) {
            Logger.getLogger(p_Owner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
   }
 // create a function to edit the selected owner data 
 public boolean editOwnerData(p_Owner owner)
   {
     
     
     PreparedStatement ps ;
     String editQuery ="UPDATE `property_owner` SET `fname`=?,`lname`=?,`phone`=?,`email`=?,`adresse`=? WHERE `id`=?";
    
     try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
            ps.setString(1, owner.getFName());
            ps.setString(2, owner.getLName());
            ps.setString(3, owner.getPhone());
            ps.setString(4, owner.getEmail());
            ps.setString(5, owner.getAdresse());
            ps.setInt(6, owner.getId());
            return (ps.executeUpdate() > 0);
          
        } catch (SQLException ex) {
            Logger.getLogger(p_Owner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
   }
 //cretae function to delete the selcted owner 
 public boolean deleteOwnerData(int ownerId)
 {
   
     PreparedStatement ps ;
     String deleteQuery ="DELETE FROM `property_owner` WHERE `id`=?";
    
     try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
            ps.setInt(1, ownerId);
            return (ps.executeUpdate() > 0);
          
        } catch (SQLException ex) {
            Logger.getLogger(p_Owner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
 }
 
 //create a function to return arraylist of owners
 public  ArrayList<p_Owner> ownerList()
 {
    
         ArrayList<p_Owner> list = new ArrayList<>();
        Statement st ;
        ResultSet rs;
        
        String selectQuery = "SELECT * FROM `property_owner` ";
        
        try {
            st = THE_CONNECTION.getTheConnection().createStatement();
             rs = st.executeQuery(selectQuery);
             
            p_Owner owner;
            while(rs.next()){
                owner = new  p_Owner(rs.getInt(1),
                                     rs.getString(2),
                                     rs.getString(3),
                                     rs.getString(4),
                                     rs.getString(5),
                                     rs.getString(6));
                list.add(owner);
            }
        } catch (SQLException ex) {
            Logger.getLogger(p_Owner.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         
         return list;
 }
}

