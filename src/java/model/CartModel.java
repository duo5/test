/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DuongHX
 */
public class CartModel {

    private HashMap<Integer, ItemModel> listProduct;

    public CartModel() {
        listProduct = new HashMap<>();
    }

    public CartModel(HashMap<Integer, ItemModel> listProduct) {
        this.listProduct = listProduct;
    }

    public HashMap<Integer, ItemModel> getListProduct() {
        return listProduct;
    }

    public void setListProduct(HashMap<Integer, ItemModel> listProduct) {
        this.listProduct = listProduct;
    }

    public void insertToCart(int key, ItemModel item) {
        boolean bln = listProduct.containsKey(key);
        if (bln) {
            int quantity_old = item.getQuantity();
            item.setQuantity(quantity_old + 1);
            listProduct.put(item.getProduct().getProductID(), item);
        } else {
            listProduct.put(item.getProduct().getProductID(), item);
        }
    }

    public void removeToCart(int key) {
        boolean bln = listProduct.containsKey(key);
        if (bln) {
            listProduct.remove(key);
        }
    }
    //total product in cart
    public int countItem() {
        return listProduct.size();
    }
    //total money
    public double total() {
        int totalMoney = 0;
        for (Map.Entry<Integer, ItemModel> list : listProduct.entrySet()) {
            totalMoney += list.getValue().getProduct().getProductPrice() * list.getValue().getQuantity();
        }
        return totalMoney;
    }
    
    
}
