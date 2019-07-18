/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.BillDAO;
import dal.BillDetailDAO;
import java.io.IOException;
import java.sql.Date;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.BillDetailModel;
import model.BillModel;
import model.CartModel;
import model.ItemModel;
import model.UserModel;
import tool.CurrentTime;
import tool.SendMail;

/**
 *
 * @author DuongHX
 */
public class ProductCheckoutController extends BaseController {

    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BillDAO bill = new BillDAO();
        BillDetailDAO bill_detail = new BillDetailDAO();
        String payment = req.getParameter("payment");
        HttpSession session = req.getSession();
        CartModel cart = (CartModel) session.getAttribute("cart");
        UserModel users = (UserModel) session.getAttribute("user");
        CurrentTime dte = new CurrentTime();
        Date date = new java.sql.Date(dte.currentTime().getTime());
        int id = (int) dte.ID();
        BillModel bil = new BillModel();
        bil.setBillID(id);
        bil.setPayment(payment);
        bil.setUserID(users.getUserID());
        bil.setDate(date);
        bil.setTotal(cart.total());
        bill.insertBill(bil);
        for (Map.Entry<Integer, ItemModel> list : cart.getListProduct().entrySet()) {
            BillDetailModel b = new BillDetailModel();
            b.setBillID(id);
            b.setProductID(list.getValue().getProduct().getProductID());
            b.setPrice(list.getValue().getProduct().getProductPrice());
            b.setQuantity(list.getValue().getQuantity());
            bill_detail.insertBillDetail(b);
   
        }
        SendMail send=new SendMail();
        send.sendMail(users.getEmail(),"Information of bill", "Cảm ơn bạn "+users.getFullName()+" đã mua hàng của chúng tôi tổng tiền là $"+cart.total());
        cart = new CartModel();
        session.setAttribute("cart", cart);
        resp.sendRedirect("list");
    }

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processPost(req, resp);
    }

}
