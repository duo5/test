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
import tool.MD5;
import model.UserModel;

/**
 *
 * @author DuongHX
 */
public class ProductRegisterController extends BaseController{

    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullname=req.getParameter("name");
        String email=req.getParameter("email");
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        String re_password=req.getParameter("confirm");
        boolean role=false;
        if(!fullname.isEmpty() && !email.isEmpty() && !email.isEmpty() && !email.isEmpty()){
        if(password.equals(re_password)){
        UserDAO udao=new UserDAO();
        MD5 md5=new MD5();
        UserModel umodel=new UserModel();
        umodel.setFullName(fullname);
        umodel.setEmail(email);
        umodel.setUserName(username);
        umodel.setPassword(md5.encryption(password));
        umodel.setRole(role);
        if(udao.insertNewUser(umodel)==true){
            req.setAttribute("error", "register successfull");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
        }
        else{
           req.setAttribute("error", "register failed");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
        }
        }else{
            req.setAttribute("error", "re-password must equal password");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
        }
        }else{
            req.setAttribute("error", "Pls enter full information");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
        }
    }

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    
}
