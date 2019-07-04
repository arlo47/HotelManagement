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
public interface IRoom {
    // Setter and Getter method for Room ID
        int getRoomId();
        void setRoomId(int roomId);
    
    // Setter and Getter method for Bill
        double getBill();
        void setBill(double bill);
    
    // Setter and Getter method for Start Date
        Date getStartDate();
        void setStartDate(Date startDate);
     
    // Setter and Getter method for End Date
        Date getEndDate();
        void setEndDate(Date endDate);
     
    // Setter and Getter method for Customer
        Customer getCustomer();
        void setCustomer(Customer customer);
    
    // Setter and Getter method for Food Service ordered
        int getFoodServiceCount();
        void setFoodServiceCount(int foodServiceCount);
    
    // Setter and Getter method for Cleaning Service ordered
        int getCleaningServiceCount();
        void setCleaningServiceCount(int cleaningServiceCount);
    
    // Setter and Getter method for Cleaning Service ordered
        int getMassageServiceCount();
        void setMassageServiceCount(int massageServiceCount);

    
}
