/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.IModel;

/**
 *
 * @author DuongHX
 * @param <T>
 */
public abstract class BaseDAO<T extends IModel> {
    protected Connection connection;
    public BaseDAO()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String user="sa";
            String pass = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=DatabaseProject";
            connection =  DriverManager.getConnection(url,user,pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
