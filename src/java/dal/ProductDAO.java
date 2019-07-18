/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ProductModel;

/**
 *
 * @author DuongHX
 */
public class ProductDAO extends BaseDAO<ProductModel> {

    public ArrayList<ProductModel> pagging(int PageIndex, int PageSize) {
        PreparedStatement statement = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            String sql = "select * from(\n"
                    + "select ROW_NUMBER() over (order by product_id asc) as rn,*\n"
                    + "from Products\n"
                    + ") as x\n"
                    + " where rn between \n"
                    + "(?-1)*? + 1 \n"
                    + "and ? * ?";
            con=connection;
            statement = con.prepareStatement(sql);
            statement.setInt(1, PageIndex);
            statement.setInt(2, PageSize);
            statement.setInt(3, PageIndex);
            statement.setInt(4, PageSize);
            rs = statement.executeQuery();
            ArrayList<ProductModel> pro = new ArrayList<>();
            while (rs.next()) {
                ProductModel product = new ProductModel();
                product.setProductID(rs.getInt("product_id"));
                product.setCategoryID(rs.getInt("category_id"));
                product.setProductName(rs.getString("product_name"));
                product.setProductImage(rs.getString("product_image"));
                product.setProductPrice(rs.getDouble("product_price"));
                product.setProductDescription(rs.getString("product_description"));
                pro.add(product);
            }
            con.close();
            return pro;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int getRowCount() {
        try {
            String sql = "SELECT COUNT(*) as Total FROM Products";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return rs.getInt("Total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public ArrayList<ProductModel> getAllProduct() {
        try {
            String sql = "SELECT [product_id]\n"
                    + "      ,[category_id]\n"
                    + "      ,[product_name]\n"
                    + "      ,[product_image]\n"
                    + "      ,[product_price]\n"
                    + "      ,[product_descriptioin]\n"
                    + "  FROM [Products]";
            PreparedStatement pstm = connection.prepareCall(sql);
            ResultSet rs = pstm.executeQuery();
            ArrayList<ProductModel> pr = new ArrayList<>();
            while (rs.next()) {
                ProductModel p = new ProductModel();
                p.setProductID(rs.getInt(1));
                p.setCategoryID(rs.getInt(2));
                p.setProductName(rs.getString(3));
                p.setProductImage(rs.getString(4));
                p.setProductPrice(rs.getDouble(5));
                p.setProductDescription(rs.getString(6));
                pr.add(p);
            }
            return pr;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<ProductModel> getTop5() {
        try {
            String sql = "select top 5*\n"
                    + "from Products\n"
                    + "order by product_id desc";
            PreparedStatement pstm = connection.prepareCall(sql);
            ResultSet rs = pstm.executeQuery();
            ArrayList<ProductModel> pr = new ArrayList<>();
            while (rs.next()) {
                ProductModel p = new ProductModel();
                p.setProductID(rs.getInt(1));
                p.setCategoryID(rs.getInt(2));
                p.setProductName(rs.getString(3));
                p.setProductImage(rs.getString(4));
                p.setProductPrice(rs.getDouble(5));
                p.setProductDescription(rs.getString(6));
                pr.add(p);
            }
            return pr;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<ProductModel> getRandom3() {
        try {
            String sql = "select top 15 percent * from Products order by newid()";
            PreparedStatement pstm = connection.prepareCall(sql);
            ResultSet rs = pstm.executeQuery();
            ArrayList<ProductModel> pr = new ArrayList<>();
            while (rs.next()) {
                ProductModel p = new ProductModel();
                p.setProductID(rs.getInt(1));
                p.setCategoryID(rs.getInt(2));
                p.setProductName(rs.getString(3));
                p.setProductImage(rs.getString(4));
                p.setProductPrice(rs.getDouble(5));
                p.setProductDescription(rs.getString(6));
                pr.add(p);
            }
            return pr;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ProductModel getProduct(int id) {
        try {
            String sql = "SELECT [product_id]\n"
                    + "      ,[category_id]\n"
                    + "      ,[product_name]\n"
                    + "      ,[product_image]\n"
                    + "      ,[product_price]\n"
                    + "      ,[product_descriptioin]\n"
                    + "  FROM [Products]\n"
                    + "  where [product_id]=?";
            PreparedStatement pstm = connection.prepareCall(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ProductModel p = new ProductModel();
                p.setProductID(rs.getInt(1));
                p.setCategoryID(rs.getInt(2));
                p.setProductName(rs.getString(3));
                p.setProductImage(rs.getString(4));
                p.setProductPrice(rs.getDouble(5));
                p.setProductDescription(rs.getString(6));
                return p;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<ProductModel> getProductByCategory(int pageIndex,int pageSize,int id) {
        try {
            String sql = "select * from(\n"
                    + "select ROW_NUMBER() over (order by product_id asc) as rn,*\n"
                    + "from Products\n"
                    + "where category_id=?\n"
                    + ") as x\n"
                    + " where rn between \n"
                    + "(?-1)*? + 1 \n"
                    + "and ? * ? ";
            PreparedStatement pstm = connection.prepareCall(sql);
            pstm.setInt(1, id);
            pstm.setInt(2, pageIndex);
            pstm.setInt(3, pageSize);
            pstm.setInt(4, pageIndex);
            pstm.setInt(5, pageSize);
            ResultSet rs = pstm.executeQuery();
            ArrayList<ProductModel> pr = new ArrayList<>();
            while (rs.next()) {
                ProductModel p = new ProductModel();
                p.setProductID(rs.getInt("product_id"));
                p.setCategoryID(rs.getInt("category_id"));
                p.setProductName(rs.getString("product_name"));
                p.setProductImage(rs.getString("product_image"));
                p.setProductPrice(rs.getDouble("product_price"));
                p.setProductDescription(rs.getString("product_descriptioin"));
                pr.add(p);
            }
            return pr;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public int getRowCountCategoryID(int id){
        try {
            String sql = "SELECT COUNT(*) as Total FROM Products where category_id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return rs.getInt("Total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
