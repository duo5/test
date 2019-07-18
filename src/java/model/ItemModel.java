/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DuongHX
 */
public class ItemModel implements IModel{
    private ProductModel product;
    private int quantity;

    public ItemModel(ProductModel product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    
    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
