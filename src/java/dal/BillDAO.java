/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BillModel;

/**
 *
 * @author DuongHX
 */
public class BillDAO extends BaseDAO<BillModel> {

    public boolean insertBill(BillModel bill) {
        try {
            String sql = "INSERT INTO [Bill]\n"
                    + "           ([bill_id]\n"
                    + "           ,[user_id]\n"
                    + "           ,[total]\n"
                    + "           ,[payment]\n"
                    + "           ,[date])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?)";
            PreparedStatement pstm=connection.prepareCall(sql);
            pstm.setInt(1, bill.getBillID());
            pstm.setInt(2, bill.getUserID());
            pstm.setDouble(3,bill.getTotal());
            pstm.setString(4, bill.getPayment());
            pstm.setDate(5, bill.getDate());
            int n=pstm.executeUpdate();
            if(n!=0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
