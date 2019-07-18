/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.UserDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.UserModel;
import tool.MD5;

/**
 *
 * @author DuongHX
 */
public class ProductLoginController extends BaseController{

    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        String username=req.getParameter("name");
        String password=req.getParameter("password");
        UserDAO udao=new UserDAO();
        MD5 md5=new MD5();
        UserModel user=udao.login(username,md5.encryption(password));
        if(user!=null){
            session.setAttribute("user", user);
            req.getRequestDispatcher("list").forward(req, resp);
        }else{
            req.setAttribute("error", "Wrong username or password");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
