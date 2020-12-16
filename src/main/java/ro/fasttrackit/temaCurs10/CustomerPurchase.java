package ro.fasttrackit.temaCurs10;

public class CustomerPurchase {
    private int ID;
    private String purchasedProduct;
    private String name;
    private String category;


    public CustomerPurchase() {
        this.ID = ID;
        this.purchasedProduct = purchasedProduct;
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "CustomerPurchase{" +
                "ID=" + ID +
                ", purchasedProduct='" + purchasedProduct + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                "}\n";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPurchasedProduct() {
        return purchasedProduct;
    }

    public void setPurchasedProduct(String purchasedProduct) {
        this.purchasedProduct = purchasedProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
