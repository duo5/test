/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ProductDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.CartModel;
import model.ItemModel;
import model.ProductModel;

/**
 *
 * @author DuongHX
 */
public class ProductCartController extends BaseController{

    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String cm=req.getParameter("param");
        String id_raw=req.getParameter("id");
        CartModel cart=(CartModel)session.getAttribute("cart");
        int id=Integer.parseInt(id_raw);
        ProductDAO pdao=new ProductDAO();
        ProductModel pmodel=pdao.getProduct(id);
        switch(cm){
            case "add":{
                if(cart.getListProduct().containsKey(id)){
                    cart.insertToCart(id, new ItemModel(pmodel, cart.getListProduct().get(id).getQuantity()));
                }else{
                    cart.insertToCart(id, new ItemModel(pmodel, 1));
                }
                break;
            }
            case "remove":{
                cart.removeToCart(id);
                break;
            }
        }
        session.setAttribute("cart",cart);
        req.getRequestDispatcher("list?page=1").forward(req, resp);
    }

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processPost(req, resp);
    }
    
}
