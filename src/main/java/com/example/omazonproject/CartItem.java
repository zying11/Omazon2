package com.example.omazonproject;

/**
 * This class is a blueprint for all cart item, which will be used in the purchase page
 *
 * @author XiangLun
 */
public class CartItem {
    private String productName;
    private String cartImagePath;
    private int quantity;
    private double pricePerUnit;
    private String sellerEmail;

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCartImagePath() {
        return cartImagePath;
    }

    public void setCartImagePath(String cartImagePath) {
        this.cartImagePath = cartImagePath;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
