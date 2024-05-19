
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amina
 */
public class P_SALE {

    private int id;
    private int propertyId;
    private int clientId;
    private String finalPrice;

    public P_SALE() {
    }

    public P_SALE(int ID, int PROPERTYID, int CLIENT_ID, String FINAL_PRICE) {
        this.id = ID;
        this.propertyId = PROPERTYID;
        this.clientId = CLIENT_ID;
        this.finalPrice = FINAL_PRICE;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

   
  

 // create a funcyion to add a new sale
    // first creat the sale in the database 
public boolean addNewSale(P_SALE sale) {
    PreparedStatement ps;
    String addQuery = "INSERT INTO `sales`(`property_id`, `client_id`, `final_price`) VALUES (?,?,?,?)";

    try {
        ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
        ps.setInt(1, sale.getPropertyId());    
        ps.setInt(2, sale.getClientId());
        ps.setString(3, sale.getFinalPrice());
      
        return (ps.executeUpdate() > 0);
    } catch (SQLException ex) {
        Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
}

 // create a function to edit the selected sale data 
 public boolean editSaleData(P_SALE sale) {
    PreparedStatement ps;
    String editQuery = "UPDATE `sales` SET `property_id`=?, `client_id`=?, `final_price`=? WHERE `id`=?";

    try {
        ps = THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
        ps.setInt(1, sale.getPropertyId());    
        ps.setInt(2, sale.getClientId());
        ps.setString(3, sale.getFinalPrice());
        return (ps.executeUpdate() > 0);
    } catch (SQLException ex) {
        Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
}

 //cretae function to delete the selcted owner 
 public boolean deleteSaleData(int SaleID)
 {
   
     PreparedStatement ps ;
     String deleteQuery ="DELETE FROM `sales` WHERE `id`=?";
    
     try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
            ps.setInt(1, SaleID);
            return (ps.executeUpdate() > 0);
          
        } catch (SQLException ex) {
            Logger.getLogger(P_TYPE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
 }
}
