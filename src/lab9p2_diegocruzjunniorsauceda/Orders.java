/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_diegocruzjunniorsauceda;

/**
 *
 * @author Junnior Sauceda
 */
public class Orders {
    private String OrderID,OrderDate,ShipDate,ShipMode,CustomerID;

    public Orders(String OrderID, String OrderDate, String ShipDate, String ShipMode, String CustomerID) {
        this.OrderID = OrderID;
        this.OrderDate = OrderDate;
        this.ShipDate = ShipDate;
        this.ShipMode = ShipMode;
        this.CustomerID = CustomerID;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public String getShipDate() {
        return ShipDate;
    }

    public void setShipDate(String ShipDate) {
        this.ShipDate = ShipDate;
    }

    public String getShipMode() {
        return ShipMode;
    }

    public void setShipMode(String ShipMode) {
        this.ShipMode = ShipMode;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    @Override
    public String toString() {
        return "Order ID :" + OrderID + "\n Order Date :" + OrderDate + "\n Ship Date :" + ShipDate + "\n Ship Mode :" + ShipMode + "\n Customer ID :" + CustomerID ;
    }
    
}
