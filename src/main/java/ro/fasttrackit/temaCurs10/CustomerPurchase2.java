package ro.fasttrackit.temaCurs10;

import org.apache.poi.ss.usermodel.Row;

import java.util.HashMap;
import java.util.Map;

public class CustomerPurchase2 {
    private int ID;
    private String purchasedProduct;
    private String name;
    private String category;

    public CustomerPurchase2(int ID, String purchasedProduct, String name, String category) {
        this.ID = ID;
        this.purchasedProduct = purchasedProduct;
        this.name = name;
        this.category = category;
    }

}
