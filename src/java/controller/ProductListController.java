/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ProductDAO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ProductModel;

/**
 *
 * @author DuongHX
 */
public class ProductListController extends BaseController {

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
        int page_size=9;
        String page_raw=req.getParameter("page");
        page_raw = (page_raw==null)?"1":page_raw;
        int page=Integer.parseInt(page_raw);
        ProductDAO pro = new ProductDAO();
        int rowcount=pro.getRowCount();
        int maxPage = rowcount/page_size + 
                (rowcount%page_size!=0?1:0);
        if(page < 1 || page > maxPage){
            req.setAttribute("error", "Not found");
            req.getRequestDispatcher("error.jsp").forward(req, resp);
        }
        ArrayList<ProductModel> prmodel = pro.pagging(page,page_size);
        req.setAttribute("products", prmodel);
        req.setAttribute("pageIndex", page);
        req.setAttribute("maxPage", maxPage);
        ArrayList<ProductModel> top5 = pro.getTop5();
        req.setAttribute("top5", top5);
        ArrayList<ProductModel> random=pro.getRandom3();
        req.setAttribute("random", random);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
        }catch(Exception e){
            req.setAttribute("error", "Null pointer");
            req.getRequestDispatcher("error.jsp").forward(req, resp);
        }
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
