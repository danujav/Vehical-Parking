/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danu
 */
public class SlotsModule {
    private int slotId;
    private int Car;
    private int Van;
    private int Bus;
    private int Lorry;

    public SlotsModule() {
    }

    public SlotsModule(int slotId, int Car, int Van, int Bus, int Lorry) {
        this.slotId = slotId;
        this.Car = Car;
        this.Van = Van;
        this.Bus = Bus;
        this.Lorry = Lorry;
    }

    /**
     * @return the slotId
     */
    public int getSlotId() {
        return slotId;
    }

    /**
     * @param slotId the slotId to set
     */
    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    /**
     * @return the Car
     */
    public int getCar() {
        return Car;
    }

    /**
     * @param Car the Car to set
     */
    public void setCar(int Car) {
        this.Car = Car;
    }

    /**
     * @return the Van
     */
    public int getVan() {
        return Van;
    }

    /**
     * @param Van the Van to set
     */
    public void setVan(int Van) {
        this.Van = Van;
    }

    /**
     * @return the Bus
     */
    public int getBus() {
        return Bus;
    }

    /**
     * @param Bus the Bus to set
     */
    public void setBus(int Bus) {
        this.Bus = Bus;
    }

    /**
     * @return the Lorry
     */
    public int getLorry() {
        return Lorry;
    }

    /**
     * @param Lorry the Lorry to set
     */
    public void setLorry(int Lorry) {
        this.Lorry = Lorry;
    }

    
    
}
