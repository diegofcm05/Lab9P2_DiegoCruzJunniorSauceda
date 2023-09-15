/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_diegocruzjunniorsauceda;

/**
 *
 * @author Junnior Sauceda
 */
public class Products {
    private String ProductID,Category,SubCategory,ProductName;

    public Products(String ProductID, String Category, String SubCategory, String ProductName) {
        this.ProductID = ProductID;
        this.Category = Category;
        this.SubCategory = SubCategory;
        this.ProductName = ProductName;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getSubCategory() {
        return SubCategory;
    }

    public void setSubCategory(String SubCategory) {
        this.SubCategory = SubCategory;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    @Override
    public String toString() {
        return "Product ID: " + ProductID + "\n Category: " + Category + "\n Sub-Category: " + SubCategory + 
                "\n Product Name: " + ProductName ;
    }
    
}
