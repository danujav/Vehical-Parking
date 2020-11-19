/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danu
 */
public class VehicalModule {

   
    private String vehicalNumber;
    private String VehicalType;
    private String ownerName;

    /**
     * @return the vehicalNumber
     */
    
    
    
    public VehicalModule() {
    }

    public VehicalModule(String vehicalNumber, String VehicalType, String ownerName) {
        this.vehicalNumber = vehicalNumber;
        this.VehicalType = VehicalType;
        this.ownerName = ownerName;
    }
    
    

    public String getVehicalNumber() {
        return vehicalNumber;
    }

    /**
     * @param vehicalNumber the vehicalNumber to set
     */
    public void setVehicalNumber(String vehicalNumber) {
        this.vehicalNumber = vehicalNumber;
    }

    /**
     * @return the VehicalType
     */
    public String getVehicalType() {
        return VehicalType;
    }

    /**
     * @param VehicalType the VehicalType to set
     */
    public void setVehicalType(String VehicalType) {
        this.VehicalType = VehicalType;
    }

    /**
     * @return the ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * @param ownerName the ownerName to set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
