
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danu
 */
public class VehicalController {

    static boolean addVehical(VehicalModule vehical) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into Vehical Values(?,?,?)");
        //PreparedStatement stm2 = connection.prepareStatement("Insert into ParkingDetails Values(?,?,?)");
        stm.setObject(1, vehical.getVehicalNumber());
        stm.setObject(2, vehical.getVehicalType());
        stm.setObject(3, vehical.getOwnerName());
        
       // stm2.setObject(1, vehical.getVehicalType());
   /*     stm2.setObject(2, arrivalTime);
        stm2.setObject(3, departureTime);
        stm2.setObject(4, perHoursFee);
     */   
        
        int res = stm.executeUpdate();
       // int res2 = stm2.executeUpdate();
        return res>0;
    }

    static VehicalModule searchVehical(String text) throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Select * From Vehical where VehicalNumber=?");
        stm.setObject(1, text);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            VehicalModule vehical=new VehicalModule(rst.getString("VehicalNumber"), rst.getString("VehicalType"), rst.getString("OwnerName"));
            return vehical;
        }
        return null;
    }

    static boolean addarrivalTime(ParkingDetailsModule parkingModule) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into ParkingDetails Values(?,?,?,?)");
        //PreparedStatement stm2 = connection.prepareStatement("Insert into ParkingDetails Values(?,?,?)");
        stm.setObject(1, parkingModule.getVehicalNumber());
        stm.setObject(2, parkingModule.getArrivalTime());
        stm.setObject(3, parkingModule.getDepartureTime());
        stm.setObject(4, parkingModule.getPayment());
        
       // stm2.setObject(1, vehical.getVehicalType());
   /*     stm2.setObject(2, arrivalTime);
        stm2.setObject(3, departureTime);
        stm2.setObject(4, perHoursFee);
     */   
        
        int res = stm.executeUpdate();
       // int res2 = stm2.executeUpdate();
        return res>0;
    }

    static ParkingDetailsModule findVehical(String text) throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Select * From ParkingDetails where VehicalNumber=?");
        stm.setObject(1, text);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            ParkingDetailsModule parkingModule = new ParkingDetailsModule(rst.getString("VehicalNumber"), rst.getString("ArrivalTime"), rst.getString("DepartureTime"), rst.getString("Payment"));
            return parkingModule;
        }
        return null;
    }

    static VehicalModule findVehicalType(String text) throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Select * From Vehical where VehicalNumber=?");
        stm.setObject(1, text);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            VehicalModule vehicalModule = new VehicalModule(rst.getString("VehicalNumber"), rst.getString("VehicalType"), rst.getString("OwnerName"));
            return vehicalModule;
        }
        return null;
    }

    static boolean addDepartureTime(ParkingDetailsModule vehical) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Update ParkingDetails set DepartureTime = ? where VehicalNumber = ?");
        stm.setObject(1, vehical.getDepartureTime());
        stm.setObject(2, vehical.getVehicalNumber());
       
        return stm.executeUpdate()>0;
    }

    static VehicalModule searchDetails(String text) throws SQLException, ClassNotFoundException {
      PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Select * From Vehical where VehicalNumber = ?");
        stm.setObject(1, text);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            VehicalModule vehicalModule = new VehicalModule(rst.getString("VehicalNumber"), rst.getString("VehicalType"), rst.getString("OwnerName"));
            return vehicalModule;
        }
        return null;  
    
    }

    static ParkingDetailsModule searchParkingDetails(String text) throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Select * From ParkingDetails where VehicalNumber = ?");
        stm.setObject(1, text);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            ParkingDetailsModule parkingModule = new ParkingDetailsModule(rst.getString("VehicalNumber"), rst.getString("ArrivalTime"), rst.getString("Departuretime"), rst.getString("Payment"));
            return parkingModule;
        }
        return null;
    }

    static boolean setPayment(ParkingDetailsModule parkingModule) throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Update ParkingDetails set Payment = ? where VehicalNumber = ?");
        stm.setObject(1, parkingModule.getPayment());
        stm.setObject(2, parkingModule.getVehicalNumber());
       
        return stm.executeUpdate()>0;
    }

    static ParkingDetailsModule serchPayment(String text) throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Select * From ParkingDetails where VehicalNumber = ?");
        stm.setObject(1, text);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            ParkingDetailsModule parkingDetailsModule=new ParkingDetailsModule(rst.getString("VehicalNumber"), rst.getString("ArrivalTime"), rst.getString("DepartureTime"), rst.getString("Payment"));
            return parkingDetailsModule;
        }
        return null;
    }

    static ArrayList<SlotsModule> getAllItem() throws SQLException, ClassNotFoundException{
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery("Select * From slots");
        ArrayList <SlotsModule> slotsList=new ArrayList<>();
        while(rst.next()){
            SlotsModule slots = new SlotsModule(rst.getInt("slotId"), rst.getInt("Car"), rst.getInt("Van"), rst.getInt("Bus"), rst.getInt("Lorry"));
            slotsList.add(slots);
        }
        return slotsList;
    }

    static boolean updateCarSlots(SlotsModule slot) throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Update slots set Car = ? where slotId=?");
        stm.setObject(1, slot.getCar());
        stm.setObject(2, slot.getSlotId());
        
        return stm.executeUpdate()>0;
    }

    static boolean updateVanSlots(SlotsModule slot) throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Update slots set Van = ? where slotId=?");
        stm.setObject(1, slot.getVan());
        stm.setObject(2, slot.getSlotId());
        
        return stm.executeUpdate()>0;
    }

    static boolean updateBusSlots(SlotsModule slot) throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Update slots set Bus = ? where slotId=?");
        stm.setObject(1, slot.getBus());
        stm.setObject(2, slot.getSlotId());
        
        return stm.executeUpdate()>0;
    }

    static boolean updateLorrySlots(SlotsModule slot) throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Update slots set Lorry = ? where slotId=?");
        stm.setObject(1, slot.getLorry());
        stm.setObject(2, slot.getSlotId());
        
        return stm.executeUpdate()>0;
    }

    static ArrayList<ParkingDetailsModule> getAllItemForTable() throws SQLException, ClassNotFoundException {
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery("Select * From ParkingDetails");
        ArrayList <ParkingDetailsModule>parkingDetailsList=new ArrayList<>();
        while(rst.next()){
            ParkingDetailsModule parkingDetailsModule=new ParkingDetailsModule (rst.getString("VehicalNumber"), rst.getString("ArrivalTime"), rst.getString("DepartureTime"), rst.getString("Payment"));
            parkingDetailsList.add(parkingDetailsModule);
        }
        return parkingDetailsList;
    }

    static ArrayList<VehicalModule> getAllItemForTableFromVehical() throws SQLException, ClassNotFoundException {
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery("Select * From Vehical");
        ArrayList <VehicalModule>vehicalDetailsList=new ArrayList<>();
        while(rst.next()){
            VehicalModule vehicalModule=new VehicalModule (rst.getString("VehicalNumber"), rst.getString("VehicalType"), rst.getString("OwnerName"));
            vehicalDetailsList.add(vehicalModule);
        }
        return vehicalDetailsList;
    }
    
}

