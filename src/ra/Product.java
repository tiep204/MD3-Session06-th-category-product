package ra;

public class Product {
    private int productId;
    private String productName;
    private float productPrice;
    private Category category;

    public Product() {
    }

    public Product(int productId, String productName, float productPrice, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    public String display(){
        return "Id sanpham: "+productId +"\n"
                +"Ten San pham: "+productName+"\n"
                +"gia: "+ productPrice+"\n"
                +"danh muc: "+category.getCategoryName();
    }
}
