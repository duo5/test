/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.IModel;



/**
 *
 * @author DuongHX
 */
public class LoginDAO extends BaseDAO<IModel>{
    public ResultSet validate(String user,String password){
        try {
            String sql="SELECT [UserName],[Password]\n" +
                        "FROM [Users]\n" +
                        "WHERE [UserName]=? and [Password]=?";
            PreparedStatement pstm=connection.prepareCall(sql);
            pstm.setString(1, user);
            pstm.setString(1, password);
            ResultSet rs=pstm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
