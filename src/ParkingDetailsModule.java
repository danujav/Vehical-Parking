/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danu
 */
public class ParkingDetailsModule {
    private String vehicalNumber;
    private String arrivalTime;
    private String departureTime;
    private String payment;

    public ParkingDetailsModule() {
    }

    public ParkingDetailsModule(String vehicalNumber, String arrivalTime, String departureTime, String payment) {
        this.vehicalNumber = vehicalNumber;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.payment = payment;
    }

    /**
     * @return the vehicalNumber
     */
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
     * @return the arrivalTime
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * @param arrivalTime the arrivalTime to set
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * @return the departureTime
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * @param departureTime the departureTime to set
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * @return the payment
     */
    public String getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(String payment) {
        this.payment = payment;
    }

    
    
}
