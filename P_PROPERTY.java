
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class P_PROPERTY {

    private int id ;
    private int type ;
    private int size ;
    private int ownerId ;
    private String price ;
    private String address ;
    private int bedrooms ;
    private int bathrooms;
    private int age ;
    private boolean balcony ;
    private boolean pool ;
    private boolean backyard ;
    private boolean garage;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBalcone() {
        return balcony;
    }

    public void setBalcone(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public boolean isBackyard() {
        return backyard;
    }

    public void setBackyard(boolean backyard) {
        this.backyard = backyard;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
            
            
    public P_PROPERTY(){}
    

    public P_PROPERTY(int ID,int TYPE,int SIZE,int OWNER_ID, String PRICE ,String ADDRESS,int BEDROOMS,int BATHROOMS ,int AGE,boolean BALCONY,boolean POOL ,boolean BACKYARD ,boolean GARAGE , String DESCRIPTION)
    {
        this.id=ID ;
        this.type=TYPE ;
        this.size=SIZE;
        this.ownerId=OWNER_ID ;
        this.price=PRICE;
        this.address=ADDRESS;
        this.bedrooms=BEDROOMS;
        this.bathrooms =BATHROOMS ;
        this.age=AGE ;
        this.balcony=BALCONY ;
        this .pool=POOL;
        this.backyard=BACKYARD ;
        this.garage=GARAGE ;
        this.description=DESCRIPTION ;
        
            }
    public boolean addNewProperty(P_PROPERTY property) {
    PreparedStatement ps = null;
    String addQuery = "INSERT INTO `the_property`(`type`, `square_feet`, `Owner_Id`, `prince`, `adress`, `bedrooms`, `bathrooms`, `age`, `balcone`, `pool`, `backyard`, `garage`, `description`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try {
        ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
        ps.setInt(1, property.getType());
        ps.setInt(2, property.getSize());
        ps.setInt(3, property.getOwnerId());
        ps.setString(4, property.getPrice());
        ps.setString(5, property.getAddress());
        ps.setInt(6, property.getBedrooms());
        ps.setInt(7, property.getBathrooms());
        ps.setInt(8, property.getAge());
        ps.setBoolean(9, property.isBalcone());
        ps.setBoolean(10, property.isPool());
        ps.setBoolean(11, property.isBackyard());
        ps.setBoolean(12, property.isGarage());
        ps.setString(13, property.getDescription());

        int rowsAffected = ps.executeUpdate();
        if (rowsAffected > 0) {
            return true;
        }

    } catch (SQLException ex) {
        Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, "SQL Exception: " + ex.getMessage(), ex);
    } finally {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, "Failed to close PreparedStatement: " + ex.getMessage(), ex);
            }
        }
    }

    return false;
}
   public boolean editProperty(P_PROPERTY property) {
    String editQuery = "UPDATE `the_property` SET `type`=?, `square_feet`=?, `Owner_Id`=?, `prince`=?, `adress`=?, `bedrooms`=?, `bathrooms`=?, `age`=?, `balcone`=?, `pool`=?, `backyard`=?, `garage`=?, `description`=? WHERE `id`= ?";
    try (PreparedStatement ps = THE_CONNECTION.getTheConnection().prepareStatement(editQuery)) {
        ps.setInt(1, property.getType());
        ps.setInt(2, property.getSize());
        ps.setInt(3, property.getOwnerId());
        ps.setString(4, property.getPrice());
        ps.setString(5, property.getAddress());
        ps.setInt(6, property.getBedrooms());
        ps.setInt(7, property.getBathrooms());
        ps.setInt(8, property.getAge());
        ps.setBoolean(9, property.isBalcone());
        ps.setBoolean(10, property.isPool());
        ps.setBoolean(11, property.isBackyard());
        ps.setBoolean(12, property.isGarage());
        ps.setString(13, property.getDescription());
        ps.setInt(14, property.getId());

        int rowsAffected = ps.executeUpdate();
        return rowsAffected > 0;
    } catch (SQLException ex) {
        Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, "Error updating property with ID: " + property.getId(), ex);
        return false;
    }
}

   public boolean removeProperty(int propertyId){
    PreparedStatement ps ;
     String deleteQuery ="DELETE FROM `the_property` WHERE `id`=?";
    
     try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
            ps.setInt(1, propertyId);
            return (ps.executeUpdate() > 0);
          
        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
          
          
    
    }
      
     
    public P_PROPERTY findProperty(int propertyId) {
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM `the_property` WHERE `id` = ?";

        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(query);
            ps.setInt(1, propertyId);

            rs = ps.executeQuery();

            if (rs.next()) {
                // Assuming the constructor P_PROPERTY(int id, int type, int size, int ownerId, String price, String address, int bedrooms, int bathrooms, int age, boolean haveBalcony, boolean havePool, boolean haveBackyard, boolean haveGarage, String description)
                return new P_PROPERTY(
                    rs.getInt("id"),
                    rs.getInt("type"),
                    rs.getInt("square_feet"),
                    rs.getInt("Owner_Id"),
                    rs.getString("prince"),
                    rs.getString("adress"),
                    rs.getInt("bedrooms"),
                    rs.getInt("bathrooms"),
                    rs.getInt("age"),
                    rs.getBoolean("balcone"),
                    rs.getBoolean("pool"),
                    rs.getBoolean("backyard"),
                    rs.getBoolean("garage"),
                    rs.getString("description")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(); // Print stack trace for debugging
        }
        return null;
    }
      //return list of properties
     public ArrayList<P_PROPERTY> propertiesList () 
     {
             return new ArrayList<P_PROPERTY>();
     }

    private int propertyId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    ArrayList<P_PROPERTY> getPropertiesList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
             
 
}   
             




