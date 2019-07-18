/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tool.CheckData;

/**
 *
 * @author DuongHX
 */
public class CheckFullNameController extends BaseController{

    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CheckData check=new CheckData();
        String fullName=req.getParameter("fullname");
        if(!fullName.isEmpty()){
        if(check.isFullName(fullName)==false){
            resp.getWriter().write("<img src=\"img/not-available.png\" /> Fullname is leter and from 1 - 50 character");
        }else{
            resp.getWriter().write("<img src=\"img/available.png\" />");
        }
        }else{
            resp.getWriter().write("<img src=\"img/not-available.png\" /> Pls enter full name");
        }
    }

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
