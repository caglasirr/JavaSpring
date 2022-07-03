package Model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    LocalDateTime createdDate = LocalDateTime.now();
    List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Order(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString(){
        return this.getProductList().toString();
    }

}
