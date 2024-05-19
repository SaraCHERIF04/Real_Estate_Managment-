import java.sql.Statement; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.HashMap;

public class P_TYPE{
 private int id ; 
 private String name ; 
 private String description; 
  
 public Integer getId(){
     return id; 
 }
 public String getName(){
  return name; 
 }
 public void setName(String NAME){
     this.name=NAME;
     }
 public String getDescription(){
    return this.description;
}
 public void setDescription(String DESCRIPTION){
     this.description=DESCRIPTION;
 }
 public P_TYPE(){}
 public P_TYPE(Integer ID,String NAME, String DESCRIPTION){
     this.id=ID; 
     this.name=NAME; 
     this.description=DESCRIPTION; 
 }
 public boolean execTypeQuery(String queryType , P_TYPE type){
         PreparedStatement ps; 
     //ADD NEW TYPE
     switch (queryType) { 
         case "add":
             try {
                 //query-> INSERT INTO `property_type`( `name`, `description`) VALUES (?,?)
                 ps= THE_CONNECTION.getTheConnection().prepareStatement("INSERT INTO `property_type`( `name`, `description`) VALUES (?,?)");
                 ps.setString(1,type.getName());
                 ps.setString(2, type.getDescription());
                 
                 return (ps.executeUpdate() >0);
             } catch (SQLException ex) {
                 Logger.getLogger(P_TYPE.class.getName()).log(Level.SEVERE, null, ex);
                 return false;
             }
         case "edit": 
             try {
                 //query-> UPDATE `property_type` SET `name`=?,`description`=? WHERE `id` = ? 
                 ps= THE_CONNECTION.getTheConnection().prepareStatement("UPDATE `property_type` SET `name`=?,`description`=? WHERE `id` = ? ");
                 ps.setString(1,type.getName());
                 ps.setString(2, type.getDescription());
                 ps.setInt(3,type.getId());
                 return (ps.executeUpdate() >0);
             } catch (SQLException ex) {
                 Logger.getLogger(P_TYPE.class.getName()).log(Level.SEVERE, null, ex);
                 return false;
             }
         case "remove":
             try {
                 // query-> DELETE FROM `property_type` WHERE `id` = ? 
                 ps= THE_CONNECTION.getTheConnection().prepareStatement("DELETE FROM `property_type` WHERE `id` = ? ");
               
                 ps.setInt(1,type.getId());
                 
                 return (ps.executeUpdate() >0);
             } catch (SQLException ex) {
                 Logger.getLogger(P_TYPE.class.getName()).log(Level.SEVERE, null, ex);
                 return false;
             }
         default:
             JOptionPane.showMessageDialog(null, "Enter The Correct Query ( add, edit,remove)", "Invalid Operation", 2);
             return false;
     }
 }
 //create a function to return a list of all types in MashMap

 public HashMap<String, Integer> getTypesMap() {
        Statement st;
        ResultSet rs;
        HashMap<String, Integer> map = new HashMap<>();
        try {
            st =  THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM `property_type`");
            P_TYPE type;
            while (rs.next()) {
                type = new P_TYPE(rs.getInt(1), rs.getString(2), rs.getString(3));
                map.put(type.getName(), type.getId());
            }

        } catch (SQLException ex) {
            Logger.getLogger(P_TYPE.class.getName()).log(Level.SEVERE, null, ex);
        }

        return map;
    }

}