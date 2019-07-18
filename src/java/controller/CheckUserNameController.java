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
import tool.CheckData;

/**
 *
 * @author DuongHX
 */
public class CheckUserNameController extends BaseController{

    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CheckData check=new CheckData();
        UserDAO udao=new UserDAO();
        String userName=req.getParameter("user");
        if(!userName.isEmpty()){
        if(check.isUserName(userName)==false){
            resp.getWriter().write("<img src=\"img/not-available.png\" /> Invalid user name");
        }else{
            if(udao.checkUserNameExist(userName)==false){
                resp.getWriter().write("<img src=\"img/available.png\" />");
            }else{
                resp.getWriter().write("<img src=\"img/not-available.png\" /> UserName is already exist");
            }
        }
        }else{
            resp.getWriter().write("<img src=\"img/not-available.png\" /> Pls enter UserName");
        }
    }

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
