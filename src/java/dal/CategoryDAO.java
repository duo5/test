/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CategoryModel;

/**
 *
 * @author DuongHX
 */
public class CategoryDAO extends BaseDAO<CategoryModel> {

    public ArrayList<CategoryModel> getListCategory() throws SQLException {

        String sql = "SELECT [category_id]\n"
                + "      ,[category_name]\n"
                + "  FROM [ProductCategory]";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        ArrayList<CategoryModel> list = new ArrayList<>();
        while (rs.next()) {
            CategoryModel c = new CategoryModel();
            c.setCategoryID(rs.getInt(1));
            c.setCategoryName(rs.getString(2));
            list.add(c);
        }
        return list;
    }

    public CategoryModel getTypeName(int id) {
        try {
            String sql = "SELECT [category_id]\n"
                    + "      ,[category_name]\n"
                    + "  FROM [ProductCategory]\n"
                    + "  where [category_id]=?\n";
            PreparedStatement pstm=connection.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                CategoryModel c=new CategoryModel();
                c.setCategoryID(rs.getInt(1));
                c.setCategoryName(rs.getString(2));
                return c;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) throws SQLException {
        CategoryDAO ca = new CategoryDAO();
        for (CategoryModel c : ca.getListCategory()) {
            System.out.println(c.getCategoryID() + ":" + c.getCategoryName());
        }
    }
}
