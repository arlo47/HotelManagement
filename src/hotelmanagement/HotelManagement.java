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
    Hotel hotel = new Hotel();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        
        String next = "y";
        
        while (next.equalsIgnoreCase("y")) {
            System.out.println("1. Book a Room");
            System.out.println("2. Order Service");
            System.out.println("3. Show Bill");
            System.out.println("4. Exit");
            int menu = scan.nextInt();

            switch(menu) {
                case 1:  
                    hotel = createRoom(hotel);   
                    break;
                case 2: 
                    orderService();
                    break;
                case 3:
                    showBill();
                    break;
                case 4:
                    System.out.println(hotel.listRooms());
                    break;
                default:   
                  next = "n";
                  System.out.println("Back to main menu");
                  break;
            }
        }
    }
    
    public static Hotel createRoom(Hotel hotel) {
        System.out.println("What Room type would you like\n" +
               "1. for Basic Suite\n" + 
               "2. for Junior Suite\n" +
               "3. for Full Suite ");
        int roomType = scan.nextInt();
        
        System.out.println("Enter room id ");
        int roomId = scan.nextInt();

//        System.out.println("What date would you like to check in? mm/dd/yyyy format ");
//        int startDate = scan.nextInt();
//
//        System.out.println("What date would you be leaving? ");
//        int endDate = scan.nextInt();

        System.out.println("Please enter customer id ");
        int customerId = scan.nextInt();

        System.out.println("Please enter your name ");
        String customerName = scan.next();

        System.out.println("Please enter your phone number ");
        String customerPhone =scan.next();

        System.out.println("Please enter your email ");
        String customerEmail = scan.next();
        
        //placeholder date
        Date date = new Date();
        
        switch(roomType) {
            case 1:
                hotel.setRooms(new Basic(12, date, date, 12, "Greg", "123456", "454545@.com"));
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return hotel;
    }
    
    public static void orderService() {
      System.out.println("Which type of service would you like? \n" +
              "1. Food\n" + 
              "2. Massage\n" + 
              "3. Cleaning\n");  
    }
    
    public static void showBill() {
 
    }
}
