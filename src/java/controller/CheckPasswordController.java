/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tool.CheckData;

/**
 *
 * @author DuongHX
 */
public class CheckPasswordController extends BaseController{

    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CheckData check=new CheckData();
        String password=req.getParameter("Password");
        if(!password.isEmpty()){
        if(check.isPassword(password)==false){
            resp.getWriter().write("<img src=\"img/not-available.png\" /> Password invalid or must 8-20 characters");
        }else{
            resp.getWriter().write("<img src=\"img/available.png\" />");
        }
        }else{
            resp.getWriter().write("<img src=\"img/not-available.png\" /> Pls enter password");
        }
    }

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
