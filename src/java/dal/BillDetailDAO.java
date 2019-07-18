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
import model.BillDetailModel;

/**
 *
 * @author DuongHX
 */
public class BillDetailDAO extends BaseDAO<BillDetailModel> {

    
    public boolean insertBillDetail(BillDetailModel bill) {
        try {
            String sql = "INSERT INTO [BillDetails]\n" +
"                              ([bill_id]\n" +
"                             ,[product_id]\n" +
"                              ,[price]\n" +
"                             ,[quantity])\n" +
"                        VALUES\n" +
"                             (?,?,?,?)";
            PreparedStatement pstm = connection.prepareCall(sql);
            pstm.setInt(1, bill.getBillID());
            pstm.setInt(2, bill.getProductID());
            pstm.setDouble(3, bill.getPrice());
            pstm.setInt(4, bill.getQuantity());
            int n = pstm.executeUpdate();
            if (n != 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
