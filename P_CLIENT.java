
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
public class P_CLIENT {
   
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
 
 public P_CLIENT(){}
 public P_CLIENT(int ID, String FName , String LName, String Phone,String Email, String Adresse ){
 
     this.id=ID;
     this.firstname =FName ;
     this.lastname=LName;
     this.phone=Phone;
     this.email=Email;
     this.Adresse=Adresse;
 }
 
 
 
 
 //create fuction to add new Client
 //first create the Client in the data base 
 
 
 public boolean addnewClient(P_CLIENT  Client){
    
     PreparedStatement ps ;
     String addQuery ="INSERT INTO `property_client`( `fname`, `lname`, `phone`, `email`, `adresse`) VALUES (?,?,?,?,?)";
    
     try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
            ps.setString(1, Client.getFName());
            ps.setString(2, Client.getLName());
            ps.setString(3, Client.getPhone());
            ps.setString(4, Client.getEmail());
            ps.setString(5, Client.getAdresse());
            
            return (ps.executeUpdate() > 0);
          
        } catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
   }
 // create a function to edit the selected Client data 
 public boolean editClientData(P_CLIENT Client)
   {
     
     
     PreparedStatement ps ;
     String editQuery ="UPDATE `property_client` SET `fname`=?,`lname`=?,`phone`=?,`email`=?,`adresse`=? WHERE `id`=?";
    
     try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
            ps.setString(1, Client.getFName());
            ps.setString(2, Client.getLName());
            ps.setString(3, Client.getPhone());
            ps.setString(4, Client.getEmail());
            ps.setString(5, Client.getAdresse());
            ps.setInt(6, Client.getId());
            return (ps.executeUpdate() > 0);
          
        } catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
   }
 //cretae function to delete the selcted Client
 public boolean deleteClient(int ClientId)
 {
   
     PreparedStatement ps ;
     String deleteQuery ="DELETE FROM `property_client` WHERE `id`=?";
    
     try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
            ps.setInt(1, ClientId);
            return (ps.executeUpdate() > 0);
          
        } catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
 }
 
 //create a function to return arraylist of Client
 public  ArrayList<P_CLIENT> clientList()
 {
    
         ArrayList<P_CLIENT> list = new ArrayList<>();
        Statement st ;
        ResultSet rs;
        
        String selectQuery = "SELECT * FROM `property_client` ";
        
        try {
            st = THE_CONNECTION.getTheConnection().createStatement();
             rs = st.executeQuery(selectQuery);
             
            P_CLIENT client;
            while(rs.next()){
                client = new  P_CLIENT(rs.getInt(1),
                                     rs.getString(2),
                                     rs.getString(3),
                                     rs.getString(4),
                                     rs.getString(5),
                                     rs.getString(6));
                list.add(client);
            }
        } catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         
         return list;
 }
}

