/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ProductDAO;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ProductModel;

/**
 *
 * @author DuongHX
 */
public class ProductDetailController extends BaseController{
    private void processRequest(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        String id_raw=req.getParameter("id");
        int id=Integer.parseInt(id_raw);
        ProductDAO pdao=new ProductDAO();
        ProductModel p=pdao.getProduct(id);
        req.setAttribute("product", p);
        req.getRequestDispatcher("products.jsp").forward(req, resp);
    }
    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
    
}
