/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_diegocruzjunniorsauceda;

/**
 *
 * @author Junnior Sauceda
 */
public class Details {
    private String OrderID,ProductID,Sales,Quantity,Discount,Profit;

    public Details(String OrderID, String ProductID, String Sales, String Quantity, String Discount, String Profit) {
        this.OrderID = OrderID;
        this.ProductID = ProductID;
        this.Sales = Sales;
        this.Quantity = Quantity;
        this.Discount = Discount;
        this.Profit = Profit;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getSales() {
        return Sales;
    }

    public void setSales(String Sales) {
        this.Sales = Sales;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String Discount) {
        this.Discount = Discount;
    }

    public String getProfit() {
        return Profit;
    }

    public void setProfit(String Profit) {
        this.Profit = Profit;
    }

    @Override
    public String toString() {
        return "Order ID: " + OrderID + "\n ProductID: " + ProductID + "\n Sales: " + Sales + "\n Quantity: " + Quantity + "\n Discount: " + Discount + "\n Profit: " + Profit ;
    }
    
}
