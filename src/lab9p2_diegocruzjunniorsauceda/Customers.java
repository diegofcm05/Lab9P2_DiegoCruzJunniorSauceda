/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_diegocruzjunniorsauceda;

/**
 *
 * @author Junnior Sauceda
 */
public class Customers {
    private String CustomerID,CustomerName,Segment,Country,City,State,PostalCode,Region;

    public Customers(String CustomerID, String CustomerName, String Segment, String Country, String City, String State, String PostalCode, String Region) {
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.Segment = Segment;
        this.Country = Country;
        this.City = City;
        this.State = State;
        this.PostalCode = PostalCode;
        this.Region = Region;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
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

    @Override
    public String toString() {
        return  "Customer ID: " + CustomerID + "\n Customer Name: " + CustomerName + "\n Segment: " + Segment + 
                "\n Country: " + Country + "\n City: " + City + "\n State: " + State + "\n Postal Code: " + PostalCode +
                "\n Region: " + Region ;
    }
    
}
