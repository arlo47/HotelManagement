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
public class Basic extends Room{
    public Basic(int roomId, Date startDate, Date endDate,int customerId, String name, String phone, String email){
        super(roomId, startDate, endDate, customerId, name, phone, email);
    }
}
