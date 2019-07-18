/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.UserModel;

/**
 *
 * @author DuongHX
 */
public class UserDAO extends BaseDAO<UserModel> {

    public boolean insertNewUser(UserModel u) {
        try {
            String sql = "INSERT INTO [Users]\n"
                    + "           ([full_name]\n"
                    + "           ,[user_name]\n"
                    + "           ,[password]\n"
                    + "           ,[email]\n"
                    + "           ,[roles])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?)";
            PreparedStatement pstm = connection.prepareCall(sql);
            pstm.setString(1, u.getFullName());
            pstm.setString(2, u.getUserName());
            pstm.setString(3, u.getPassword());
            pstm.setString(4, u.getEmail());
            pstm.setBoolean(5, u.isRole());
            int n = pstm.executeUpdate();
            if (n != 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean checkEmailExist(String email) {
        try {
            String sql = "SELECT * FROM Users WHERE email = ?";
            PreparedStatement pstm = connection.prepareCall(sql);
            pstm.setString(1, email);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean checkUserNameExist(String userName) {
        try {
            String sql = "SELECT * FROM Users WHERE user_name = ?";
            PreparedStatement pstm = connection.prepareCall(sql);
            pstm.setString(1, userName);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public UserModel login(String username, String password) {
        try {
                    String sql = "SELECT [user_id]\n"
                + "      ,[full_name]\n"
                + "      ,[user_name]\n"
                + "      ,[password]\n"
                + "      ,[email]\n"
                + "      ,[roles]\n"
                + "  FROM [Users]\n"
                + "WHERE [user_name]=? and [password]=?";
        PreparedStatement pstm=connection.prepareCall(sql);
        pstm.setString(1, username);
        pstm.setString(2, password);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                UserModel u = new UserModel();
                u.setUserID(rs.getInt("user_id"));
                u.setFullName(rs.getString("full_name"));
                u.setUserName(rs.getString("user_name"));
                u.setPassword(rs.getString("password"));
                u.setEmail(rs.getString("email"));
                u.setRole(rs.getBoolean("roles"));
                return u;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
