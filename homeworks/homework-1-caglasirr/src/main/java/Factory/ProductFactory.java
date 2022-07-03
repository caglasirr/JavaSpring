package Factory;

import Model.Product;

public interface ProductFactory {
    public Product create(String productType);

}
