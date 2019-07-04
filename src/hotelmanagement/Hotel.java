/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

import java.util.ArrayList;

/**
 *
 * @author 0722273
 */
public class Hotel {
    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    
    Hotel() {}

//    public boolean isReturningCustomer() {
//       Method not implemended yet.
//    }
    
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Room r) {
        this.rooms.add(r);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Customer c) {
        this.customers.add(c);
    }
    
    public StringBuilder listCustomers() {
        StringBuilder sb = new StringBuilder(); 
        
        for(int i = 0; i < customers.size(); i++) {
            sb.append(customers.get(i).getCustomerId()).append("   ")
              .append(customers.get(i).getName()).append("   ")
              .append(customers.get(i).getPhone()).append("   ")
              .append(customers.get(i).getEmail()).append("   ")
              .append("\n");
        }
        return sb;
    }
    
    public StringBuilder listRooms() {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < 10; i++) {
              sb.append(i)
                .append("\n");
        }
        return sb;
    }
    
}
