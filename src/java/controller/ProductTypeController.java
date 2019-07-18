/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CategoryDAO;
import dal.ProductDAO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CategoryModel;
import model.ProductModel;

/**
 *
 * @author DuongHX
 */
public class ProductTypeController extends BaseController {

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        int pageSize = 3;
        String id_raw = req.getParameter("id");
        int id = Integer.parseInt(id_raw);
        String pageIndex_raw = req.getParameter("page");
        pageIndex_raw = (pageIndex_raw == null) ? "1" : pageIndex_raw;
        int pageIndex = Integer.parseInt(pageIndex_raw);
        ProductDAO pdao = new ProductDAO();
        int rowcount = pdao.getRowCountCategoryID(id);
        int maxPage = rowcount / pageSize
                + (rowcount % pageSize != 0 ? 1 : 0);
        ArrayList<ProductModel> list = pdao.getProductByCategory(pageIndex, pageSize, id);
        CategoryDAO cdao=new CategoryDAO();
        CategoryModel c=cdao.getTypeName(id);
        req.setAttribute("category", c);
        req.setAttribute("products", list);
        req.setAttribute("pageIndex", pageIndex);
        req.setAttribute("maxPage", maxPage);
        req.getRequestDispatcher("type-product.jsp").forward(req, resp);
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
