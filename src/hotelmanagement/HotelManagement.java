/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author 1346511
 */
public class HotelManagement {
    static Scanner scan = new Scanner(System.in);
    static Hotel hotel = new Hotel();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String next = "y";
        
        Date date = new Date();
        hotel.setRooms(new Basic(12, date, date, 23, "Greg", "425-1102", "greg@kennyloggins.qc.ca"));
       
        System.out.println("List of Rooms:");
        hotel.listRooms();
        
//        while (next.equalsIgnoreCase("y")) {
//            System.out.println("1. Book a Room");
//            System.out.println("2. Order Service");
//            System.out.println("3. Show Bill");
//            System.out.println("4. Exit");
//            int menu = scan.nextInt();
//        
//            switch(menu) {
//                case 1:  
//                    createRoom();   
//                    break;
//                case 2:  
//                    orderService();
//                    break; 
//                case 3: 
//                    showBill();
//                    break;
//                case 4:
//                    System.out.println("List of Customers:");
//                    hotel.listCustomers();
//                    System.out.println("\n\nList of Rooms:");
//                    hotel.listRooms();
//                    break;
//                default:   
//                    next = "n";
//                    System.out.println("Back to main menu");
//                    break;
//            }
//        }   
    }
    
    public static void createRoom() {
        //ASking for user input 
        System.out.println("What Room type would you like\n" +
                            "1. for Basic Suite\n" + 
                            "2. for Junior Suite\n" +
                            "3. for Full Suite ");
        int roomType = scan.nextInt();
        //roomId
        System.out.println("What is the room Id? ");
        int roomId = scan.nextInt();
        //startDate
//        System.out.println("What date would you like to check in? mm/dd/yyyy format ");
//        int startDate = scan.nextInt();
        // enddate 
//        System.out.println("What date would you be leaving? ");
//        int endDate = scan.nextInt();
        // Customer Id
        System.out.println("Please enter a customer ID ");
        int customerId = scan.nextInt();
        // CustomerName
        System.out.println("Please enter your name ");
        String customerName = scan.next();
        // CustomerPhone
        System.out.println("Please enter your phone number ");
        String customerPhone =scan.next();
        // CustomerEmail
        System.out.println("Please enter your email ");
        String customerEmail = scan.next();  
        
        //Placeholder date for testing
        Date date = new Date();
        
        switch(roomType) {
            case 1:
                hotel.setRooms(new Basic(roomId, date, date, customerId, customerName, customerPhone, customerEmail));
                break;
            case 2:
                hotel.setRooms(new JuniorSuite(roomId, date, date, customerId, customerName, customerPhone, customerEmail));
                break;
            case 3:
                hotel.setRooms(new FullSuite(roomId, date, date, customerId, customerName, customerPhone, customerEmail));
                break;
        }
    }
    
    public static void orderService() {
      System.out.println("Which type of service would you like? \n"
                        + "1. Food\n"
                        + "2. Massage\n" 
                        + "3. Cleaning\n");  
    }
    
    public static void showBill() {
        
        
    }
}
