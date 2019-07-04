/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;
import java.util.Date;
/**
 *
 * @author 1332549
 */
public abstract class Room implements IRoom {
    private int roomId;
    private double bill;
    private Date startDate;
    private Date endDate;
    private Customer customer;
    private int foodServiceCount;
    private int cleaningServiceCount;
    private int massageServiceCount;
    
    public Room(int roomId, Date startDate, Date endDate,int customerId, String name, String phone, String email){
        setRoomId(roomId);
        setStartDate(startDate);
        setEndDate(endDate);
        
        // Creating new customer Object c
        Customer c = new Customer(customerId, name, phone, email);
    }
    
    // Getter method for room Id
    @Override
    public int getRoomId() {
        return roomId;
    }
    
    // Setter method for room Id
    @Override
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
    
    // Getter method for Bill
    @Override
    public double getBill() {
        return bill;
    }

    // Setter method for Bill
    @Override
    public void setBill(double bill) {
        this.bill = bill;
    }

    // Getter method for Start Date
    @Override
    public Date getStartDate() {
        return startDate;
    }
    
    // Setter method for Start Date
    @Override
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    // Getter method for End Date
    @Override
    public Date getEndDate() {
        return endDate;
    }
    
    // Setter method for End Date
    @Override
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    // Getter method for customer
    @Override
    public Customer getCustomer() {
        return customer;
    }
    
    // Setter method for customer
    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    @Override
    public int getFoodServiceCount() {
        return foodServiceCount;
    }

    @Override
    public void setFoodServiceCount(int foodServiceCount) {
        this.foodServiceCount = foodServiceCount;
    }

    @Override
    public int getCleaningServiceCount() {
        return cleaningServiceCount;
    }

    @Override
    public void setCleaningServiceCount(int cleaningServiceCount) {
        this.cleaningServiceCount = cleaningServiceCount;
    }

    @Override
    public int getMassageServiceCount() {
        return massageServiceCount;
    }

    @Override
    public void setMassageServiceCount(int massageServiceCount) {
        this.massageServiceCount = massageServiceCount;
    }
   
}
