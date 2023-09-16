/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_diegocruzjunniorsauceda;

/**
 *
 * @author Junnior Sauceda
 */
public class Registro {
    private String orderId,OrderDate,shipDate,shipMode,customerId,
            customerName,Segment,Country,City,State,PostalCode,Region,ProductId,Category,SubCateg,ProductName,Sales,Quantity,Discount,Profit;

    private String linea;
    
    public Registro(String orderId, String OrderDate, String shipDate, String shipMode, String customerId, String customerName, String Segment, String Country, String City, String State, String PostalCode, String Region, String ProductId, String Category, String SubCateg, String ProductName, String Sales, String Quantity, String Discount, String Profit) {
        this.orderId = orderId;
        this.OrderDate = OrderDate;
        this.shipDate = shipDate;
        this.shipMode = shipMode;
        this.customerId = customerId;
        this.customerName = customerName;
        this.Segment = Segment;
        this.Country = Country;
        this.City = City;
        this.State = State;
        this.PostalCode = PostalCode;
        this.Region = Region;
        this.ProductId = ProductId;
        this.Category = Category;
        this.SubCateg = SubCateg;
        this.ProductName = ProductName;
        this.Sales = Sales;
        this.Quantity = Quantity;
        this.Discount = Discount;
        this.Profit = Profit;
    }

    public Registro(String linea, String orderId, String OrderDate, String customerId, String Country, String City, String ProductId, String Sales) {
        this.linea = linea;
        this.orderId = orderId;
        this.OrderDate = OrderDate;
        this.customerId = customerId;
        this.Country = Country;
        this.City = City;
        this.ProductId = ProductId;
        this.Sales = Sales;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }
    
    
    
    

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public String getShipMode() {
        return shipMode;
    }

    public void setShipMode(String shipMode) {
        this.shipMode = shipMode;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSegment() {
        return Segment;
    }

    public void setSegment(String Segment) {
        this.Segment = Segment;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getSubCateg() {
        return SubCateg;
    }

    public void setSubCateg(String SubCateg) {
        this.SubCateg = SubCateg;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
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
        return "Registro{" + "orderId=" + orderId + ", OrderDate=" + OrderDate + ", shipDate=" + shipDate + ", shipMode=" + shipMode + ", customerId=" + customerId + ", customerName=" + customerName + ", Segment=" + Segment + ", Country=" + Country + ", City=" + City + ", State=" + State + ", PostalCode=" + PostalCode + ", Region=" + Region + ", ProductId=" + ProductId + ", Category=" + Category + ", SubCateg=" + SubCateg + ", ProductName=" + ProductName + ", Sales=" + Sales + ", Quantity=" + Quantity + ", Discount=" + Discount + ", Profit=" + Profit + '}';
    }
    
    
}
